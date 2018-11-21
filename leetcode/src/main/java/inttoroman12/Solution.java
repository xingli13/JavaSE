package inttoroman12;

import java.util.ArrayList;
import java.util.List;

/**
 * @author xingli13
 * @date 2018/11/21
 */
public class Solution {

	public String intToRoman(int num) {
		StringBuilder sb = new StringBuilder();
		// TODO: 2018/11/21 这种写法可以简化
		// TODO: 2018/11/21 整数除法有意思
		int[] intValues = new int[]{1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] strValues = new String[]{"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

//		value.add(new Object[]{1000, "M"});
//		value.add(new Object[]{900, "CM"});
//		value.add(new Object[]{500, "D"});
//		value.add(new Object[]{400, "CD"});
//		value.add(new Object[]{100, "C"});
//		value.add(new Object[]{90, "XC"});
//		value.add(new Object[]{50, "L"});
//		value.add(new Object[]{40, "XL"});
//		value.add(new Object[]{10, "X"});
//		value.add(new Object[]{9, "IX"});
//		value.add(new Object[]{5, "V"});
//		value.add(new Object[]{4, "IV"});
//		value.add(new Object[]{1, "I"});
		int i = 0;
		int tmp;
		while (i < intValues.length) {
			if (num == 0) break;
			tmp = intValues[i];
			if (num - tmp >= 0) {
				sb.append(strValues[i]);
				num -= tmp;
			} else i++;
		}
		return sb.toString();
	}
//	float 9/10 >= 0.9?
//	else if ((float) num / tmp >= 0.9) {
//		num -= 0.9 * tmp;
//		sb.append(value.get(i + 2)[1]).append(value.get(i)[1]);
//		i++;
//	} else if (String.valueOf(tmp).startsWith("5") && (float) num / tmp >= 0.8) {
//		num -= 0.8 * tmp;
//		sb.append(value.get(i + 1)[1]).append(value.get(i)[1]);
//		i++;
//	}
}
