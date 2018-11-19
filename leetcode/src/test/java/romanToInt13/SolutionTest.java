package romanToInt13;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.assertj.core.api.Assertions.assertThat;


/**
 * @author xingli13
 * @date 2018/11/19
 */
@RunWith(JUnitParamsRunner.class)
public class SolutionTest {
	static Solution solution;

	@BeforeClass
	public static void init() {
		solution = new Solution();
	}

	@Test
	@Parameters({
			"III, 3",
			"IV, 4",
			"IX, 9",
			"LVIII, 58",
			"MCMXCIV, 1994"
	})
	public void romanToInt(String s, int value) {
		assertThat(solution.romanToInt(s)).isEqualTo(value);
	}
}