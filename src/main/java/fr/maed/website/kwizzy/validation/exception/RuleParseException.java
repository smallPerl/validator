package fr.maed.website.kwizzy.validation.exception;

public class RuleParseException extends Exception {

    public RuleParseException() { }

    public RuleParseException(String definer, String key) {
        super("Invalid rule for key " + key + " : " + definer + ".");
    }

    public RuleParseException(String key) {
        super(key);
    }
}
