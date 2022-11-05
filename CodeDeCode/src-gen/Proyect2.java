// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/Proyect2.gold"
import gold.*;
import gold.structures.*;
import gold.structures.automaton.*;
import gold.structures.bag.*;
import gold.structures.collection.*;
import gold.structures.deque.*;
import gold.structures.disjointset.*;
import gold.structures.graph.*;
import gold.structures.heap.*;
import gold.structures.list.*;
import gold.structures.map.*;
import gold.structures.multimap.*;
import gold.structures.point.*;
import gold.structures.queue.*;
import gold.structures.set.*;
import gold.structures.stack.*;
import gold.structures.tree.*;
import gold.structures.tree.binary.*;
import gold.structures.tree.nary.*;
import gold.structures.tuple.*;
import gold.structures.turingMachine.*;
import gold.swing.*;
import gold.swing.icon.*;
import gold.swing.icon.ajaxload.*;
import gold.swing.icon.famfamfam.*;
import gold.swing.icon.gold.*;
import gold.swing.icon.jlfgr.*;
import gold.swing.icon.wikimedia.*;
import gold.swing.icon.windows.*;
import gold.swing.look.*;
import gold.swing.util.*;
import gold.test.*;
import gold.test.automaton.*;
import gold.test.general.*;
import gold.test.graph.*;
import gold.util.*;
import gold.visualization.*;
import gold.visualization.automaton.*;
import gold.visualization.graph.*;
import gold.visualization.quadtree.*;
import gold.visualization.turingMachine.*;
import gold.visualization.util.*;
import java.lang.*;
import org.apfloat.*;
import static gold.util.GReflection.*;
@SuppressWarnings("all")
public final class Proyect2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object A=null;
  public static Object B=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=10;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField("in",$invokeField(System.class,"System",true,null))});
      $line=12;
      A=$fix($opIntvlY('a','z'));
      $line=13;
      B=$fix($opIntvlY('0','9'));
      $line=16;
      Object coder=$fix(Proyect2.createCoder());
      $line=17;
      Object deCoder=$fix(Proyect2.createDecoder());
      $line=20;
      GAutomataFrame.show($cast(void.class,coder));
      $line=21;
      GAutomataFrame.show($cast(void.class,deCoder));
      $line=24;
      $invokeMethod(Utilities.class,"testCodeDecode",true,null,new Object[]{coder,deCoder});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=31;
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet($opIntvlY('a','z')))) {
        for (Object s:GCollections.unmodifiableCollection(GCollections.asSet(0,1,2))) {
          int $v3=$int(0);
          int $v4=$int(4)-1;
          for (int pos=$v3; pos<=$v4; pos++) {
            $v1.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object Q=$fix($opUnionY($opUnionY($v1,GCollections.asSet(0,1,2,"I","E")),$opCartsY(new Object[]{GCollections.asSet(0,1,2),$opIntvlY('a','z')})));
      $line=32;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ','$')));
      $line=33;
      Object \u03A3_=$fix($opUnionY($opUnionY(\u03A3,GCollections.asSet('0','1','2')),GCollections.asSet('#','*','@')));
      $line=34;
      Object q_0=$fix("I");
      $line=35;
      gold.structures.set.ISet $v5=$newSet();
      $v6:for (Object d:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
        for (Object s:GCollections.unmodifiableCollection(GCollections.asSet(0,1,2))) {
          int $v7=$int(0);
          int $v8=$int(4)-1;
          for (int pos=$v7; pos<=$v8; pos++) {
            $v5.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object F=$fix($v5);
      $line=37;
      $result=$invokeMethod(Proyect2.class,"GDeterministicTransducer",true,null,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(Proyect2.class,"\u03B4"),new GMethod(Proyect2.class,"g"),new GMethod(Proyect2.class,"h")});
      if (true) break $try;
      $line=38;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=43;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=43;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=44;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=44;
          $result=GCollections.asList(state,input);
          if (true) break $try;
        }
        else {
          $line=45;
          if ($opMembrY(state,GCollections.asSet(2,3,5,"I","E"))) {
            $line=45;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=46;
            if (($opEqualY($opAbsolY(state),2)&&$opEqualY(input,':'))) {
              $line=46;
              $result=GCollections.asList($getArrayValue(state,new Object[]{0}),$getArrayValue(state,new Object[]{1}),1);
              if (true) break $try;
            }
            else {
              $line=47;
              if (($opEqualY($opAbsolY(state),3)&&$opMembrY(input,$opIntvlY('a','z')))) {
                $line=48;
                Object $v9=$getArrayValue(state,new Object[]{0});
                Object $v10=$getArrayValue(state,new Object[]{1});
                Object $v11=$getArrayValue(state,new Object[]{2});
                Object d=$fix($v9);
                Object s=$fix($v10);
                Object pos=$fix($v11);
                $line=49;
                $result=GCollections.asList(d,s,$opModulY($opAdditY(pos,1),d));
                if (true) break $try;
              }
              else {
                $line=50;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=53;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=61;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=61;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=62;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=62;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=63;
          if ($opMembrY(state,GCollections.asSet(2,3,5,"I","E"))) {
            $line=63;
            $result="";
            if (true) break $try;
          }
          else {
            $line=64;
            if (($opEqualY($opAbsolY(state),2)&&$opEqualY(input,':'))) {
              $line=64;
              $result=":";
              if (true) break $try;
            }
            else {
              $line=65;
              if (($opEqualY($opAbsolY(state),3)&&$opMembrY(input,$opIntvlY('a','z')))) {
                $line=66;
                Object $v12=$getArrayValue(state,new Object[]{0});
                Object $v13=$getArrayValue(state,new Object[]{1});
                Object $v14=$getArrayValue(state,new Object[]{2});
                Object d=$fix($v12);
                Object s=$fix($v13);
                Object pos=$fix($v14);
                $line=67;
                if (($opEqualY(0,pos)&&$opEqualY(input,s))) {
                  $line=67;
                  $result="#";
                  if (true) break $try;
                }
                else {
                  $line=68;
                  if ($opEqualY(pos,1)) {
                    $line=68;
                    $result=$invokeMethod(Proyect2.class,"shiftSymbol",true,null,new Object[]{input,d});
                    if (true) break $try;
                  }
                  else {
                    $line=69;
                    $result=input;
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=71;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=74;
      $rethrow(new RuntimeException("The function \"h(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=78;
      $result="";
      if (true) break $try;
      $line=79;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"g",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=84;
      gold.structures.set.ISet $v15=$newSet();
      $v16:for (Object d:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
        int $v17=$int(0);
        int $v18=$int(4)-1;
        for (int pos=$v17; pos<=$v18; pos++) {
          $v15.add(GCollections.asList(d,pos));
        }
      }
      Object Q=$fix($opUnionY($opUnionY($v15,GCollections.asSet("I","E","fin")),$opIntvlY('a','z')));
      $line=85;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(' ','$')));
      $line=86;
      Object \u03A3_=$fix($opUnionY($opUnionY(\u03A3,GCollections.asSet('0','1','2')),GCollections.asSet('#','*','@')));
      $line=87;
      Object q_0=$fix("I");
      $line=88;
      gold.structures.set.ISet $v19=$newSet();
      $v20:for (Object d:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
        int $v21=$int(0);
        int $v22=$int(4)-1;
        for (int pos=$v21; pos<=$v22; pos++) {
          $v19.add(GCollections.asList(d,pos));
        }
      }
      Object F=$fix($v19);
      $line=90;
      $result=$invokeMethod(Proyect2.class,"GDeterministicTransducer",true,null,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(Proyect2.class,"\u03B41"),new GMethod(Proyect2.class,"g"),new GMethod(Proyect2.class,"h1")});
      if (true) break $try;
      $line=91;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=97;
      while (true) {
        if (!((!$opEqualY(input,' ')&&$opEqualY(state,'I')))) break;
        $line=98;
        if ($opMembrY(state,GCollections.asSet("fin","E"))) {
          $line=98;
          $result="E";
          if (true) break $try;
        }
        else {
          $line=99;
          if ($opEqualY(state,'$')) {
            $line=99;
            $result="fin";
            if (true) break $try;
          }
          else {
            $line=100;
            if (($opEqualY(state,"I")&&$opEqualY(input,' '))) {
              $line=100;
              $result=GCollections.asList($getArrayValue(state,new Object[]{0}),0);
              if (true) break $try;
            }
            else {
              $line=101;
              if (($opEqualY(state,"I")&&$opMembrY(input,$opIntvlY('a','z')))) {
                $line=102;
                Object $v23=$getArrayValue(state,new Object[]{0});
                Object $v24=$getArrayValue(state,new Object[]{1});
                Object d=$fix($v23);
                Object pos=$fix($v24);
                $line=103;
                $result=GCollections.asList(d,$opAdditY(pos,1));
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=107;
      $rethrow(new RuntimeException("The function \"\u03B41(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v25, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v26=GCollections.unmodifiableCollection($v25).iterator();
      Object d=$v26.next();
      Object s=$v26.next();
      Object pos=$v26.next();
      $line=112;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=112;
        $result=GCollections.asList(d,s,1);
        if (true) break $try;
      }
      else {
        $line=113;
        if ($opEqualY(pos,"_")) {
          $line=113;
          $result="E";
          if (true) break $try;
        }
        else {
          $line=114;
          if (($opEqualY(input,'#')&&!$opEqualY(pos,0))) {
            $line=114;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=115;
            if (($opEqualY(input,s)&&$opEqualY(pos,0))) {
              $line=115;
              $result="E";
              if (true) break $try;
            }
            else {
              $line=116;
              if ($opMembrY(input,$opUnionY($opIntvlY('a','z'),GCollections.asSet('#')))) {
                $line=116;
                $result=GCollections.asList(d,s,$opModulY($opAdditY(pos,1),d));
                if (true) break $try;
              }
              else {
                $line=117;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=119;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=122;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=122;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=123;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=123;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=124;
          $result="";
          if (true) break $try;
        }
      }
      $line=126;
      $rethrow(new RuntimeException("The function \"h1(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v27, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v28=GCollections.unmodifiableCollection($v27).iterator();
      Object d=$v28.next();
      Object s=$v28.next();
      Object pos=$v28.next();
      $line=129;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=129;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=130;
        if (($opEqualY(input,'#')&&$opEqualY(pos,0))) {
          $line=130;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=131;
          if (($opMembrY(input,$opIntvlY('a','z'))&&$opEqualY(pos,1))) {
            $line=131;
            $result=$invokeMethod(Proyect2.class,"shiftSymbol",true,null,new Object[]{input,$opMinusY(d)});
            if (true) break $try;
          }
          else {
            $line=132;
            if ($opMembrY(input,$opIntvlY('a','z'))) {
              $line=132;
              $result=input;
              if (true) break $try;
            }
            else {
              $line=133;
              $result="";
              if (true) break $try;
            }
          }
        }
      }
      $line=135;
      $rethrow(new RuntimeException("The function \"h1(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"h1",$line);
    }
    return $result;
  }
  public static Object shiftSymbol(Object symbol, Object shift) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=139;
      Character r=null;
      r=$defaultValue(Character.class);
      $line=141;
      if ($opMembrY(symbol,$opIntvlY('a','z'))) {
        $line=142;
        r=$cast(Character.class,$fix($opAdditY('a',$opModulY($opAdditY($opSubtrY(symbol,'a'),shift),26))));
      }
      else {
        $line=143;
        if ($opMembrY(symbol,$opIntvlY('A','Z'))) {
          $line=144;
          r=$cast(Character.class,$fix($opAdditY('A',$opModulY($opAdditY($opSubtrY(symbol,'A'),shift),26))));
        }
        else {
          $line=145;
          if ($opMembrY(symbol,$opIntvlY('0','9'))) {
            $line=146;
            r=$cast(Character.class,$fix($opAdditY('0',$opModulY($opAdditY($opSubtrY(symbol,'0'),shift),10))));
          }
          else {
            $line=147;
            r=$cast(Character.class,$fix(r));
          }
        }
      }
      $line=149;
      $result=r;
      if (true) break $try;
      $line=150;
      $rethrow(new RuntimeException("The function \"shiftSymbol(symbol:Object,shift:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,Proyect2.class,"shiftSymbol",$line);
    }
    return $result;
  }
}
