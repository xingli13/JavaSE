package inttoroman12;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author xingli13
 * @date 2018/11/21
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {
	Solution solution = new Solution();

	@Test
	@Parameters({
			"3, III",
			"4, IV",
			"9, IX",
			"58, LVIII",
			"1994, MCMXCIV"
	})
	public void intToRoman(int num, String roman) {
		assertThat(solution.intToRoman(num)).isEqualTo(roman);
	}

	@Test
	public void testFloat() {
		for (int i = 0; i < 100; i++) {
			assertThat((float) 9 / 10 == 0.9).isTrue();
			assertThat(9 / (float) 10 == 0.9).isTrue();
			assertThat(((float) 9) / 10 == 0.9).isTrue();

		}
	}
}