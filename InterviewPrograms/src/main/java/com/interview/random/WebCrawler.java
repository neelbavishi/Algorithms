package com.interview.random;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class WebCrawler {
	Set<String> vs = new ConcurrentHashMap<>().newKeySet();

	public List<String> crawl(String startUrl, HtmlParser htmlParser) {
		String host = getHost(startUrl);
		vs.add(startUrl); // add first in case of dup
		return crawl(startUrl, host, htmlParser).collect(Collectors.toList());
	}

	private Stream<String> crawl(String start, String host, HtmlParser parser) {
		Stream<String> c = parser.getUrls(start).parallelStream().filter(s -> getHost(s).equals(host))
				.filter(s -> vs.add(s)).flatMap(s -> crawl(s, host, parser)); // use flat map in case of null;

		return Stream.concat(Stream.of(start), c);
	}

	private String getHost(String url) {
		return url.split("/")[2];
	}
}

interface HtmlParser {
	// Return a list of all urls from a webpage of given url.
	// This is a blocking call, that means it will do HTTP request and return when
	// this request is finished.
	public List<String> getUrls(String url);
}