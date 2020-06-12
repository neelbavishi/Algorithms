package com.interview.random;

import java.util.Stack;

public class ValidParenthesis {

	public boolean isValid(String s) {
		Stack<Character> s1 = new Stack<Character>();

		if (s.length() == 0)
			return true;
		if (s.length() == 1)
			return false;

		int i = 0;
		while (i < s.length()) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				s1.push(s.charAt(i));
			} else {
				if (s1.isEmpty())
					return false;

				if (s.charAt(i) == ')' && s1.peek() != '(')
					return false;
				else if (s.charAt(i) == '}' && s1.peek() != '{')
					return false;
				else if (s.charAt(i) == ']' && s1.peek() != '[')
					return false;

				s1.pop();
			}

			i++;
		}

		if (s1.size() != 0)
			return false;

		return true;
	}
}
