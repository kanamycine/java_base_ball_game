package baseballafterfeedback.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RefereeTest {
    private Referee referee;
    private static final List<Integer> ANSWER = Arrays.asList(1, 2, 3);

    @BeforeEach
    void setUp() {
        referee = new Referee();
    }

    @ParameterizedTest
    @CsvSource({"1,2,3,0볼 3스트라이크", "7,8,9,낫싱", "2,3,1,3볼 0스트라이크"})
    public void compare(int number1, int number2, int number3, String result) {
        String actual = referee.compare(ANSWER, Arrays.asList(number1, number2, number3));
        assertThat(actual).isEqualTo(result);
    }

    // 아래와 동일 (한꺼번에 처리)

    @Test
    void strike3() {
        String result = referee.compare(ANSWER, Arrays.asList(1, 2, 3));
        assertThat(result).isEqualTo("0볼 3스트라이크");
    }

    @Test
    void nothing() {
        String result = referee.compare(ANSWER, Arrays.asList(7, 8, 9));
        assertThat(result).isEqualTo("낫싱");
    }

    @Test
    void ball3() {
        String result = referee.compare(ANSWER, Arrays.asList(2, 3, 1));
        assertThat(result).isEqualTo("3볼 0스트라이크");
    }
}