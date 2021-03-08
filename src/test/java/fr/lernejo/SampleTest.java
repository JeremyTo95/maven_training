package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {
    private Sample sample = new Sample();

    @ParameterizedTest
    @CsvSource({
        "3, 7, 10",
        "0, 3, 3",
    })
    void addition_test(int a, int b, int expectedResult) {
        int s = sample.op(Sample.Operation.ADD, a, b);
        Assertions.assertThat(s).isEqualTo(expectedResult);
    }

    @Test
    void op_throws_if_operation_is_null() {
        Assertions.assertThatExceptionOfType(NullPointerException.class).isThrownBy(() -> sample.op(null, 1, 3));
    }

    @ParameterizedTest
    @CsvSource({
        "0, 3, 0",
        "3, 3, 9"
    })
    void multi_test(int a, int b, int expectedResult) {
        int s = sample.op(Sample.Operation.MULT, a, b);

        Assertions.assertThat(s).isEqualTo(expectedResult);
    }
}
