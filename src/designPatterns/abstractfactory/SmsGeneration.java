package designPatterns.abstractfactory;

public class SmsGeneration implements ContentGenerator {
    @Override
    public String generateContent(String message) {
        return "SMS Content: " + message;
    }
}
