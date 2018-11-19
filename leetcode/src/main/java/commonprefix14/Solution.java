package commonprefix14;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 *
 * @author xingli13
 * @date 2018/11/19
 */
public class Solution {
	/**
	 * 两个公共的就是世界的
	 * todo 将好代码摘抄下来
	 *
	 * @param strs strs数组
	 * @return 公共字符串
	 */
	public String longestCommonPrefix(String[] strs) {
		if (strs.length == 0) return "";
		int charAt;
		for (charAt = 0; charAt < Integer.MAX_VALUE; charAt++) {
			char first = 0;
			for (int j = 0; j < strs.length; j++) {
				if (charAt == strs[j].length()) {
					return strs[0].substring(0, charAt);
				}
				if (first == 0) {
					first = strs[j].charAt(charAt);
				} else if (first != strs[j].charAt(charAt)) {
					return strs[0].substring(0, charAt);
				}
			}
		}
		return strs[0].substring(0, charAt);
	}

	public String longestCommonPrefixStandard(String[] strs) {
		if (strs == null || strs.length == 0) return "";
		String pre = strs[0];
		int i = 1;
		while (i < strs.length) {
			while (strs[i].indexOf(pre) != 0) {
				pre = pre.substring(0, pre.length() - 1);
			}
			i++;
		}
		return pre;
	}
}
