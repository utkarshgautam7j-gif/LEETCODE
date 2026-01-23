class Solution {
    public String reverseVowels(String s) {
        int i=0;
        int j=s.length()-1;
        char [] arr=s.toCharArray();
        while(i<j){
            int lv=0;
            int rv=0;
            char ch=arr[i];
            char rch=arr[j];

            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'){
                    lv=1;
            }
            else{
                i++;
            }

            if(rch=='a'||rch=='e'||rch=='i'||rch=='o'||rch=='u'||
                rch=='A'||rch=='E'||rch=='I'||rch=='O'||rch=='U'){
                    rv=1;

            }
            else{
                j--;
            }

            if(lv==1 && rv==1){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        return new String(arr);

        
    }
}

/*
class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int[] index = new int[s.length()];
        int c = 0, k = 0, z = 0;

        for (char ch : arr) {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                index[k++] = z;
                c++;
            }
            z++;
        }

        char[] v = new char[c];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                v[a++] = ch;
            }
        }

        for (int i = 0, j = v.length - 1; i < j; i++, j--) {
            char t = v[i];
            v[i] = v[j];
            v[j] = t;
        }

        StringBuilder ans = new StringBuilder();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (j < c && i == index[j]) {
                ans.append(v[j++]);
            } else {
                ans.append(arr[i]);
            }
        }

        return ans.toString();
    }
}
*/

/*
class Solution {
    public String reverseVowels(String s) {

        char[] arr = s.toCharArray();
        int[] index = new int[s.length()];
        int c = 0, k = 0, z = 0;

        for (char ch : arr) {
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                index[k++] = z;
                c++;
            }
                z++;
        }

        char[] v = new char[c];
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            char ch = arr[i];
            if (ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
                ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U') {

                v[a++] = ch;
            }
        }

        for (int i = 0, j = v.length - 1; i < j; i++, j--) {
            char t = v[i];
            v[i] = v[j];
            v[j] = t;
        }

        StringBuilder ans = new StringBuilder();
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (j < c && i == index[j]) {
                ans.append(v[j++]);
            } else {
                ans.append(arr[i]);
            }
        }

        return ans.toString();
    }
}

*/