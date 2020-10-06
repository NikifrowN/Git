public class Main {

    public static void main(String[] args) {

        String text = "Here you can find activities to practise your reading skills. Reading will help you to improve your understanding of the language and build your vocabulary. The self-study lessons in this section are written and organised according to the levels of the Common European Framework of Reference for languages (CEFR). There are different types of texts and interactive exercises that practise the reading skills you need to do well in your studies, to get ahead at work and to communicate in English in your free time";


        String[]  words = text.split(" ");
        for(int i = 0; i < words.length; i++) {
            words[i] = words[i].replaceAll("[^a-zA-z]", "");
            System.out.println(words[i]);
        }
    }
}
