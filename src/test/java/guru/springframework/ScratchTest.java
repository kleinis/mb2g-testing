package guru.springframework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ScratchTest {

    static Scratch scratch;
    @BeforeAll
    public static void init(){
        scratch = new Scratch("Comment");
    }
    @Test
    public void getComment() {
        Assertions.assertEquals("Comment", scratch.getComment());
    }
}