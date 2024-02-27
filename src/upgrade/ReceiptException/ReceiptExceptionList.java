package upgrade.ReceiptException;

public class ReceiptExceptionList {
    public static void validateChoice(String choice) {
        String regex = "[1-4]";
        if (!choice.matches(regex)) {
            throw new ReceiptException(ReceiptErrorCode.INVALID_CHOICE);
        }
        if (choice.length() > 1){
            throw new ReceiptException(ReceiptErrorCode.INVALID_CHOICE);
        }
    }

    public static void validateMenuChoice(String choice) {
        String regex = "[1-5]";
        if (!choice.matches(regex)) {
            throw new ReceiptException(ReceiptErrorCode.INVALID_CHOICE);
        }
        if (choice.length() > 1){
            throw new ReceiptException(ReceiptErrorCode.INVALID_CHOICE);
        }
    }

    public static void validateId(String input){
        String regex = "[0-9]+";
        if (!input.matches(regex)){
            throw new ReceiptException(ReceiptErrorCode.INVALID_INPUT_ERROR);
        }
    }

    public static void validateMonth(String input){
        String regex = "[0-9]|1[0-2]";
        if (!input.matches(regex)){
            throw new ReceiptException(ReceiptErrorCode.INVALID_INPUT_ERROR);
        }
    }
    public static void validateDate(String choice){
        String regex = "[(\\d{4})(\\d{2})(\\d{2})]";
        if (!choice.matches(regex)){
            throw new ReceiptException(ReceiptErrorCode.INVALID_INPUT_ERROR);
        }
    }
    public static void validateInputChoice(String input){
        String regex = "[yn]";
        if (!input.matches(regex)){
            throw new ReceiptException(ReceiptErrorCode.INVALID_INPUT_ERROR);
        }
        if (input.length() > 1){
            throw new ReceiptException(ReceiptErrorCode.INVALID_CHOICE);
        }
    }


}
