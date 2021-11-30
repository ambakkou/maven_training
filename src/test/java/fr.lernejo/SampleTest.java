package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SampleTest {
    private final Sample sample = new Sample();

    @Test
    void op_add_5_by_5_should_produce_10() {
       int result = sample.op(Sample.Operation.ADD,5,5);
        Assertions.assertThat(result).as("addition of 5 with 5")
            .isEqualTo(10);
    }
    @Test
    void op_mult_5_by_5_should_produce_10() {
        int result = sample.op(Sample.Operation.MULT,5,5);
        Assertions.assertThat(result).as("multiplication of 5 with 5")
            .isEqualTo(25);
    }

    @Test
    void fact_by_negative_should_produce_an_exception() {
        int neg = -1;
        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
            .isThrownBy(() -> sample.fact(neg));
    }

    @Test
    void fact_of_0_should_produce_1() {
        int result = sample.fact(0);
        Assertions.assertThat(result).as("factorial 0")
            .isEqualTo(1);
    }

    @Test
    void fact_of_5_should_produce_120() {
        int result = sample.fact(5);
        Assertions.assertThat(result).as("factorial 5")
            .isEqualTo(120);
    }
}
