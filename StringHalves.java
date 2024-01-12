//  Determine if String Halves Are Alike
class StringHalves {
    public boolean halvesAreAlike(String s) {
        int n = s.length();

        int i = 0;
        int j = n-1;
        int a = 0;
        int b = 0;

        while(i<j){
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);

            if(ch1=='a' || ch1=='e' || ch1=='i' || ch1=='o' || ch1=='u' || ch1=='A' || ch1=='E' || ch1=='I' || ch1=='O' || ch1=='U') a++;

            if(ch2=='a' || ch2=='e' || ch2=='i' || ch2=='o' || ch2=='u' || ch2=='A' || ch2=='E' || ch2=='I' || ch2=='O' || ch2=='U') b++;

            i++;
            j--;
        }

        return a==b;
    }
}