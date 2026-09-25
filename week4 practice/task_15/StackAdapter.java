package task_15;

public class StackAdapter implements ISimpleStack {
    private final LegacyArrayStack legacyStack;

    public StackAdapter(LegacyArrayStack legacyStack) {
        this.legacyStack = legacyStack;
    }

    @Override
    public void push(int value) {
        legacyStack.pushInt(value);
    }

    @Override
    public int pop() {
        return legacyStack.popInt();
    }

    @Override
    public boolean isEmpty() {
        return legacyStack.count() == 0;
    }
}
