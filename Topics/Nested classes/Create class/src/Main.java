
class StringOperations {

    static class EngString {
        boolean english;
        String string;

        EngString(boolean english, String string) {
            this.english = english;
            this.string = string;
        }

        boolean isEnglish() {
            return english;
        }

        String getString() {
            return string;
        }
    }
}