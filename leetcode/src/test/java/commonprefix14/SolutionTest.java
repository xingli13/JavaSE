package commonprefix14;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;

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
	public void longestCommonPrefix() {
		String[] strs = new String[]{
				"flowers", "flow", "flight"
		};
		assertThat(solution.longestCommonPrefix(strs)).isEqualTo("fl");
		assertThat(solution.longestCommonPrefix(new String[]{
				"dog", "racecar", "car"
		})).isEqualTo("");
		assertThat(solution.longestCommonPrefix(new String[]{
				"abc", "abcd"
		})).isEqualTo("abc");
		assertThat(solution.longestCommonPrefix(new String[]{
				"abcdf"
		})).isEqualTo("abcdf");
	}
}