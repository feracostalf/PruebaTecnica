import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestApp {

    static App app;


@Test
@ParameterizedTest
@ValueSource(strings = {"( ( )", "( ( ) ) )", "( { [ ] } }"})
public void isNotBalanced(String input){
    assertEquals(false, App.isBalanced(input));
}

@Test
@ParameterizedTest
@ValueSource(strings = {"( ( ( ) ) )", "( ) { } [ ]", "( { [ ] } )"})
public void isBalanced(String input){
    assertEquals(true, App.isBalanced(input));
}



}
