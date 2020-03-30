package com.github.maciejpalczak.music;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Gamut {
    private final List<String>gamut=new ArrayList<>();
    private final List<String>A0=new ArrayList<>();
    private final List<String>B0=new ArrayList<>();
    private final List<String>C0=new ArrayList<>();
    private final List<String>D0=new ArrayList<>();
    private final List<String>E0=new ArrayList<>();
    private final List<String>F0=new ArrayList<>();
    private final List<String>G0=new ArrayList<>();
    private final List<String>H0=new ArrayList<>();
    private final List<String>I0=new ArrayList<>();
    private final List<String>J0=new ArrayList<>();
    private final List<String>K0=new ArrayList<>();
    private final List<String>L0=new ArrayList<>();
    private final List<String>A=new ArrayList<>();
    private final List<String>B=new ArrayList<>();
    private final List<String>C=new ArrayList<>();
    private final List<String>D=new ArrayList<>();
    private final List<String>E=new ArrayList<>();
    private final List<String>F=new ArrayList<>();
    private final List<String>G=new ArrayList<>();
    private final List<String>H=new ArrayList<>();
    private final List<String>I=new ArrayList<>();
    private final List<String>J=new ArrayList<>();
    private final List<String>K=new ArrayList<>();
    private final List<String>L=new ArrayList<>();
    private final List<String>A1=new ArrayList<>();
    private final List<String>B1=new ArrayList<>();
    private final List<String>C1=new ArrayList<>();
    private final List<String>D1=new ArrayList<>();
    private final List<String>E1=new ArrayList<>();
    private final List<String>F1=new ArrayList<>();
    private final List<String>G1=new ArrayList<>();
    private final List<String>H1=new ArrayList<>();
    private final List<String>I1=new ArrayList<>();
    private final List<String>J1=new ArrayList<>();
    private final List<String>K1=new ArrayList<>();
    private final List<String>L1=new ArrayList<>();
    private final List<String[]>values=new ArrayList<>();
    private final List<String>basic=new ArrayList<>();
    private final void fill(){
        String[] strings={"c,", "deses,", "bisis,,", "cis,", "des,", "cisis,", "d,", "eses,", "dis,", "es,", "feses,", "disis,", "e,", "fes,", "eis,", "f,", "geses,", "eisis,", "fis,", "ges,", "fisis,", "g,", "ases,", "gis,", "as,", "gisis,", "a,", "beses,", "ais,", "bes,", "ceses,", "aisis,", "b,", "ces,","bis,", "c", "deses", "bisis,", "cis", "des", "cisis", "d", "eses", "dis", "es", "feses", "disis", "e", "fes", "eis", "f", "geses", "eisis", "fis", "ges", "fisis", "g", "ases", "gis", "as", "gisis", "a", "beses", "ais", "bes", "ceses'", "aisis", "b", "ces'", "bis", "c'", "deses'", "bisis", "cis'", "des'", "cisis'", "d'", "eses'", "dis'", "es'", "feses'", "disis'", "e'", "fes'", "eis'", "f'", "geses'", "eisis'", "fis'", "ges'", "fisis'", "g'", "ases'", "gis'", "as'", "gisis'", "a'", "beses'", "ais'", "bes'", "ceses''", "aisis'", "b'", "ces''", "bis'", "c''"};
        String[] a0={"bis,,", "c,", "deses,"};
        String[] b0={"bisis,,", "cis,", "des,"};
        String[] c0={"cisis,", "d,", "eses,"};
        String[] d0={"dis,", "es,", "feses,"};
        String[] e0={"disis,", "e,", "fes,"};
        String[] f0={"eis,", "f,", "geses,"};
        String[] g0={"eisis,", "fis,", "ges,"};
        String[] h0={"fisis,", "g,", "ases,"};
        String[] i0={"gis,", "as,"};
        String[] j0={"gisis,", "a,", "beses,"};
        String[] k0={"ais,", "bes,", "ceses"};
        String[] l0={"aisis,", "b,", "ces"};
        String[] a={"bis,", "c", "deses"};
        String[] b={"bisis,", "cis", "des"};
        String[] c={"cisis", "d", "eses"};
        String[] d={"dis", "es", "feses"};
        String[] e={"disis", "e", "fes"};
        String[] f={"eis", "f", "geses"};
        String[] g={"eisis", "fis", "ges"};
        String[] h={"fisis", "g", "ases"};
        String[] i={"gis", "as"};
        String[] j={"gisis", "a", "beses"};
        String[] k={"ais", "bes", "ceses'"};
        String[] l={"aisis", "b", "ces'"};
        String[] a1={"bis", "c'", "deses'"};
        String[] b1={"bisis", "cis'", "des'"};
        String[] c1={"cisis'", "d'", "eses'"};
        String[] d1={"dis'", "es'", "feses'"};
        String[] e1={"disis'", "e'", "fes'"};
        String[] f1={"eis'", "f'", "geses'"};
        String[] g1={"eisis'", "fis'", "ges'"};
        String[] h1={"fisis'", "g'", "ases'"};
        String[] i1={"gis'", "as'"};
        String[] j1={"gisis'", "a'", "beses'"};
        String[] k1={"ais'", "bes'", "ceses''"};
        String[] l1={"aisis'", "b'", "ces''"};
        String[] basics={"c,","d,","e,","f,","g,","a,","b","c","d","e","f","g","a","b","c'","d'","e'","f'","g'","a'","b'","c''"};
        String[][] vals={a0,b0,c0,d0,e0,f0,g0,h0,i0,j0,k0,l0,a,b,c,d,e,f,g,h,i,j,k,l,a1,b1,c1,d1,e1,f1,g1,h1,i1,j1,k1,l1};
        gamut.addAll(Arrays.asList(strings));
        values.addAll(Arrays.asList(vals));
        basic.addAll(Arrays.asList(basics));
        A.addAll(Arrays.asList(a));
        B.addAll(Arrays.asList(b));
        C.addAll(Arrays.asList(c));
        D.addAll(Arrays.asList(d));
        E.addAll(Arrays.asList(e));
        F.addAll(Arrays.asList(f));
        G.addAll(Arrays.asList(g));
        H.addAll(Arrays.asList(h));
        I.addAll(Arrays.asList(i));
        J.addAll(Arrays.asList(j));
        K.addAll(Arrays.asList(k));
        L.addAll(Arrays.asList(l));
        A0.addAll(Arrays.asList(a0));
        B0.addAll(Arrays.asList(b0));
        C0.addAll(Arrays.asList(c0));
        D0.addAll(Arrays.asList(d0));
        E0.addAll(Arrays.asList(e0));
        F0.addAll(Arrays.asList(f0));
        G0.addAll(Arrays.asList(g0));
        H0.addAll(Arrays.asList(h0));
        I0.addAll(Arrays.asList(i0));
        J0.addAll(Arrays.asList(j0));
        K0.addAll(Arrays.asList(k0));
        L0.addAll(Arrays.asList(l0));
        A1.addAll(Arrays.asList(a1));
        B1.addAll(Arrays.asList(b1));
        C1.addAll(Arrays.asList(c1));
        D1.addAll(Arrays.asList(d1));
        E1.addAll(Arrays.asList(e1));
        F1.addAll(Arrays.asList(f1));
        G1.addAll(Arrays.asList(g1));
        H1.addAll(Arrays.asList(h1));
        I1.addAll(Arrays.asList(i1));
        J1.addAll(Arrays.asList(j1));
        K1.addAll(Arrays.asList(k1));
        L1.addAll(Arrays.asList(l1));

    }

    public List<String> getGamut() {
        return gamut;
    }

    public Gamut() {fill();}

    public List<String[]> getValues() {
        return values;
    }

    public List<String> getBasic() {
        return basic;
    }

    public List<String> getA0() {
        return A0;
    }

    public List<String> getB0() {
        return B0;
    }

    public List<String> getC0() {
        return C0;
    }

    public List<String> getD0() {
        return D0;
    }

    public List<String> getE0() {
        return E0;
    }

    public List<String> getF0() {
        return F0;
    }

    public List<String> getG0() {
        return G0;
    }

    public List<String> getH0() {
        return H0;
    }

    public List<String> getI0() {
        return I0;
    }

    public List<String> getJ0() {
        return J0;
    }

    public List<String> getK0() {
        return K0;
    }

    public List<String> getL0() {
        return L0;
    }

    public List<String> getA() {
        return A;
    }

    public List<String> getB() {
        return B;
    }

    public List<String> getC() {
        return C;
    }

    public List<String> getD() {
        return D;
    }

    public List<String> getE() {
        return E;
    }

    public List<String> getF() {
        return F;
    }

    public List<String> getG() {
        return G;
    }

    public List<String> getH() {
        return H;
    }

    public List<String> getI() {
        return I;
    }

    public List<String> getJ() {
        return J;
    }

    public List<String> getK() {
        return K;
    }

    public List<String> getL() {
        return L;
    }

    public List<String> getA1() {
        return A1;
    }

    public List<String> getB1() {
        return B1;
    }

    public List<String> getC1() {
        return C1;
    }

    public List<String> getD1() {
        return D1;
    }

    public List<String> getE1() {
        return E1;
    }

    public List<String> getF1() {
        return F1;
    }

    public List<String> getG1() {
        return G1;
    }

    public List<String> getH1() {
        return H1;
    }

    public List<String> getI1() {
        return I1;
    }

    public List<String> getJ1() {
        return J1;
    }

    public List<String> getK1() {
        return K1;
    }

    public List<String> getL1() {
        return L1;
    }
}
