public class KeyboardAdapter implements Controller {

    private Keyboard keyboard;


    @Override
    public boolean isLeft() {
        return keyboard.keyPressed().equals(Key.ARROW_LEFT);
    }

    @Override
    public boolean isRight() {
        return keyboard.keyPressed().equals(Key.ARROW_RIGHT);
    }

    @Override
    public boolean isPush() {
        return keyboard.keyPressed().equals(Key.SPACEBAR);
    }
}
