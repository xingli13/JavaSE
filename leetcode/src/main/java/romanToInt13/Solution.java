package romanToInt13;

// https://leetcode.com/problems/roman-to-integer/
// https://leetcode.com/problems/roman-to-integer/discuss/6529/My-solution-for-this-question-but-I-don't-know-is-there-any-easier-way
/**
 * @author xingli13
 * @date 2018/11/19
 */
public class Solution {

	/**
	 * 更普遍的情况应该提取出来
	 * @param s
	 * @return
	 */
	public int romanToInt(String s) {
		int value = 0;
		char[] array = s.toCharArray();
		for (int i = 0; i < array.length; i++) {
			switch (array[i]) {
				case 'I':
					value += 1;
					break;
				case 'V':
					if (i > 0 && array[i - 1] == 'I') {
						value += 3;
					} else {
						value += 5;
					}
					break;
				case 'X':
					if (i > 0 && array[i - 1] == 'I') {
						value += 8;
					} else {
						value += 10;
					}
					break;
				case 'L':
					if (i > 0 && array[i - 1] == 'X') {
						value += 30;
					} else {
						value += 50;
					}
					break;
				case 'C':
					if (i > 0 && array[i - 1] == 'X') {
						value += 80;
					} else {
						value += 100;
					}
					break;
				case 'D':
					if (i > 0 && array[i - 1] == 'C') {
						value += 300;
					} else {
						value += 500;
					}
					break;
				case 'M':
					if (i > 0 && array[i - 1] == 'C') {
						value += 800;
					} else {
						value += 1000;
					}
					break;
				default:
			}
		}
		return value;
	}

}
