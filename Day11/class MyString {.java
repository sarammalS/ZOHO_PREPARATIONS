class MyString {
    private char[] data;

   
    public MyString(String input) {
        data = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            data[i] = input.charAt(i);
        }
    }

    
    public MyString(char[] input) {
        data = new char[input.length];
        for (int i = 0; i < input.length; i++) {
            data[i] = input[i];
        }
    }

    public int length() {
        return data.length;
    }

    public char charAt(int index) {
        if (index < 0 || index >= data.length) throw new IndexOutOfBoundsException();
        return data[index];
    }

    public boolean equals(MyString other) {
        if (this.length() != other.length()) return false;
        for (int i = 0; i < data.length; i++) {
            if (this.data[i] != other.data[i]) return false;
        }
        return true;
    }

    public MyString toUpperCase() {
        char[] result = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'a' && data[i] <= 'z') {
                result[i] = (char) (data[i] - 32);
            } else {
                result[i] = data[i];
            }
        }
        return new MyString(result);
    }

    public MyString toLowerCase() {
        char[] result = new char[data.length];
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= 'A' && data[i] <= 'Z') {
                result[i] = (char) (data[i] + 32);
            } else {
                result[i] = data[i];
            }
        }
        return new MyString(result);
    }

    public MyString substring(int start, int end) {
        if (start < 0 || end > data.length || start > end) throw new IndexOutOfBoundsException();
        char[] result = new char[end - start];
        for (int i = start; i < end; i++) {
            result[i - start] = data[i];
        }
        return new MyString(result);
    }

    public MyString concat(MyString other) {
        char[] result = new char[this.length() + other.length()];
        for (int i = 0; i < this.length(); i++) {
            result[i] = this.data[i];
        }
        for (int i = 0; i < other.length(); i++) {
            result[this.length() + i] = other.data[i];
        }
        return new MyString(result);
    }

    public boolean contains(MyString sub) {
        for (int i = 0; i <= this.length() - sub.length(); i++) {
            int j;
            for (j = 0; j < sub.length(); j++) {
                if (this.data[i + j] != sub.data[j]) {
                    break;
                }
            }
            if (j == sub.length()) return true;
        }
        return false;
    }

    public int indexOf(char ch) {
        for (int i = 0; i < this.length(); i++) {
            if (this.data[i] == ch) return i;
        }
        return -1;
    }

    public MyString replace(char oldChar, char newChar) {
        char[] result = new char[this.length()];
        for (int i = 0; i < this.length(); i++) {
            result[i] = (this.data[i] == oldChar) ? newChar : this.data[i];
        }
        return new MyString(result);
    }

    public String toString() {
        return new String(data);
    }

    
    public static void main(String[] args) {
        MyString str1 = new MyString("HelloWorld");
        MyString str2 = new MyString("Hello");

        System.out.println("Length: " + str1.length());
        System.out.println("charAt(4): " + str1.charAt(4));
        System.out.println("Equals: " + str1.equals(str2));
        System.out.println("To Upper: " + str1.toUpperCase());
        System.out.println("To Lower: " + str1.toLowerCase());
        System.out.println("Substring(0,5): " + str1.substring(0, 5));
        System.out.println("Concat: " + str1.concat(str2));
        System.out.println("Contains 'loWo': " + str1.contains(new MyString("loWo")));
        System.out.println("Index of 'W': " + str1.indexOf('W'));
        System.out.println("Replace 'l' with 'x': " + str1.replace('l', 'x'));
    }
}
