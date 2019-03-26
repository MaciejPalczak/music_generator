package com.github.maciejpalczak.music;

public class Templates {
    private final static String template ="\\version \"2.18.2\"\n\n\\paper {\n" +
            "\t#(set-paper-size \"a4\")\n" +
            "}\n" +
            "\n" +
            "\\layout {\n" +
            "\tindent = 0\\in\n" +
            "ragged-last = ##f\n" +
            "\t\\context {\n" +
            "\t\t\\Score\n" +
            "\t\t\\remove \"Bar_number_engraver\"\n" +
            "\t}\n" +
            "}";

    private final static String pre1 ="\\relative c'' {\nc4 cis4 d4 dis4 e4 f4 fis4 g4 gis4 a4 ais4 b4 bis4 c4" ;



    private final static String post1="\n\\bar \"||\"\n" + "}";
    private final static String pre2 ="\\relative c'' {\n" ;
    private final static String post2="\n\\bar \"||\"\n" + "}";

    public static String getPre1() {
        return pre1;
    }
    public static String getPost1() {
        return post1;
    }
    public static String getTemplate() {
        return template;
    }
    public static String getPre2() {
        return pre2;
    }
    public static String getPost2() {
        return post2;
    }
}
