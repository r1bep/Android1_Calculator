package com.example.android1_calculator;

public class CalculateLogic {
    private int firstArg;
    private int secondArg;
    private int actionSelected;

    private final StringBuilder inputStr = new StringBuilder();

    private State state;

    private enum State {
        firstArgInput,
        operationSelected,
        secondArgInput,
        resultShow
    }

    public CalculateLogic() {
        state = State.firstArgInput;
    }

    public void onNumPressed(int buttonId) {

        if (state == State.resultShow) {
            state = State.firstArgInput;
            inputStr.setLength(0);
        }

        if (state == State.operationSelected) {
            state = State.secondArgInput;
            inputStr.setLength(0);
        }

        if (inputStr.length() < 9) {
            switch (buttonId) {
                case R.id.butt0:
                    if (inputStr.length() != 0) {
                        inputStr.append("0");
                    }
                    break;
                case R.id.butt1:
                    inputStr.append("1");
                    break;
                case R.id.butt2:
                    inputStr.append("2");
                    break;
                case R.id.butt3:
                    inputStr.append("3");
                    break;
                case R.id.butt4:
                    inputStr.append("4");
                    break;
                case R.id.butt5:
                    inputStr.append("5");
                    break;
                case R.id.butt6:
                    inputStr.append("6");
                    break;
                case R.id.butt7:
                    inputStr.append("7");
                    break;
                case R.id.butt8:
                    inputStr.append("8");
                    break;
                case R.id.butt9:
                    inputStr.append("9");
                    break;
            }
        }
    }

    public void onActionPressed(int actionId) {
        if (actionId == R.id.equals && state == State.secondArgInput && inputStr.length() > 0) {
            secondArg = Integer.parseInt(inputStr.toString());
            state = State.resultShow;
            inputStr.setLength(0);
            switch (actionSelected) {
                case R.id.plus:
                    inputStr.append(firstArg + secondArg);
                    break;
                case R.id.minus:
                    inputStr.append(firstArg - secondArg);
                    break;
                case R.id.multiply:
                    inputStr.append(firstArg * secondArg);
                    break;
                case R.id.division:
                    inputStr.append(firstArg / secondArg);
                    break;
            }

        } else if (inputStr.length() > 0 && state == State.firstArgInput && actionId != R.id.equals) {
            firstArg = Integer.parseInt(inputStr.toString());
            state = State.operationSelected;
            actionSelected = actionId;
        }
    }

    public String getText() {
        StringBuilder str = new StringBuilder();
        switch (state) {
            default:
                return inputStr.toString();
            case operationSelected:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .toString();
            case secondArgInput:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .append(' ')
                        .append(inputStr)
                        .toString();
            case resultShow:
                return str.append(firstArg).append(' ')
                        .append(getOperationChar())
                        .append(' ')
                        .append(secondArg)
                        .append(" = ")
                        .append(inputStr.toString())
                        .toString();
        }
    }

    private char getOperationChar() {
        switch (actionSelected) {
            case R.id.plus:
                return '+';
            case R.id.minus:
                return '-';
            case R.id.multiply:
                return '*';
            case R.id.division:
            default:
                return '/';

        }
    }

    public void reset() {
        state = State.firstArgInput;
        inputStr.setLength(0);
    }
}
