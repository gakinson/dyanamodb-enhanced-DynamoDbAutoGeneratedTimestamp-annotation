package software.amazon.awssdk.enhanced.dynamodb.extensions;

public enum AutoGenerateStrategy {


    /**
     * Instructs to always generate both on create and update.
     */
    ALWAYS,

    /**
     * Instructs to generate on create only.
     */
    CREATE;
}
