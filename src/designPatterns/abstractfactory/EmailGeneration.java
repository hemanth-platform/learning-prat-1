package designPatterns.abstractfactory;

public class EmailGeneration implements ContentGenerator {
    @Override
    public String generateContent(String message) {
        return "Email Content: " + message;
    }
}
