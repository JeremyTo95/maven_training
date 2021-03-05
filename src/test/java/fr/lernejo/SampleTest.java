package fr.lernejo;

import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

class SampleTest {
    private Sample sample = new Sample();

    @Test
    void addition_test() {
        int a = 3;
        int b = 5;
        int s = sample.op(Sample.Operation.ADD, a, b);

        Assertions.assertThat(s).as(a + " x " + b).isEqualTo(8);
    }

    @Test
    void multi_test() {
        int a = 3;
        int b = 5;
        int s = sample.op(Sample.Operation.MULT, a, b);

        Assertions.assertThat(s).as(a + " + " + b).isEqualTo(15);
    }
}
