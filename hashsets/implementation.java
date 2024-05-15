package hashsets;

import java.util.HashSet;

public class implementation {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("james");// herwe hashset is the implemetnation of the class set
        // so no repition of the string take place
        // set has no guarantee of element
        st.add("thomas");
        st.add("john");
        st.add("thomas");

        System.out.println(st);
        System.out.println(st.size());
        st.remove("james");
        System.out.println(st.contains("james"));

        for (

        String s : st)
        // for each loop
        {
            System.out.println(s);
        }
    }
}
