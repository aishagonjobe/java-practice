class ProgrammingLanguages {
    public static void main(String[] args) {
        String[] Languages = {"Java", "python", "go", "javascript"};
        for (int i = 0; i < 4; i++) {
            if (Languages[i] == "python") {
                continue;
            }
            System.out.println("Programming Language: " + Languages[i]);
        }
    }
}