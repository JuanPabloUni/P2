// DO NOT EDIT THIS FILE! IT IS AUTOMATICALLY GENERATED FROM FILE "src/CD3_2.gold"
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
public final class CD3_2 {
  static {
    gold.swing.util.GUtilities.installGoldLookAndFeel();
  }
  public static Object A=null;
  public static Object B=null;
  public static void main(String[] args) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=28;
      java.util.Scanner sc=null;
      sc=$invokeConstructor(java.util.Scanner.class,new Object[]{$invokeField("in",$invokeField(System.class,"System",true,null))});
      $line=30;
      A=$fix($opIntvlY('a','z'));
      $line=31;
      B=$fix($opIntvlY('0','9'));
      $line=32;
      Object coder=$fix(CD3_2.createCoder());
      $line=33;
      Object deCoder=$fix(CD3_2.createDecoder());
      $line=40;
      $invokeMethod(Utilities.class,"testCodeDecode",true,null,new Object[]{coder,deCoder});
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"main",$line);
    }
  }
  public static ITransducer createCoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=51;
      gold.structures.set.ISet $v1=$newSet();
      $v2:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          int $v3=$int(0);
          int $v4=$int(5)-1;
          for (int pos=$v3; pos<=$v4; pos++) {
            $v1.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object Q=$fix($opUnionY($opUnionY($v1,GCollections.asSet(3,2,5,"I","E")),$opCartsY(new Object[]{GCollections.asSet(3,2,5),$opIntvlY('a','z')})));
      $line=53;
      Object \u03A3=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','2','3','5')));
      $line=54;
      Object \u03A3_=$fix($opUnionY(\u03A3,GCollections.asSet('#')));
      $line=55;
      Object q_0=$fix("I");
      $line=56;
      gold.structures.set.ISet $v5=$newSet();
      $v6:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          int $v7=$int(0);
          int $v8=$int(5)-1;
          for (int pos=$v7; pos<=$v8; pos++) {
            $v5.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object F=$fix($v5);
      $line=58;
      $result=$invokeMethod(CD3_2.class,"GDeterministicTransducer",true,null,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(CD3_2.class,"\u03B4"),new GMethod(CD3_2.class,"g"),new GMethod(CD3_2.class,"h")});
      if (true) break $try;
      $line=59;
      $rethrow(new RuntimeException("The function \"createCoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"createCoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B4(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=66;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=66;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=67;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=67;
          $result=GCollections.asList(state,input);
          if (true) break $try;
        }
        else {
          $line=68;
          if ($opMembrY(state,GCollections.asSet(2,3,5,"I","E"))) {
            $line=68;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=69;
            if (($opEqualY($opAbsolY(state),2)&&$opEqualY(input,':'))) {
              $line=69;
              $result=GCollections.asList($getArrayValue(state,new Object[]{0}),$getArrayValue(state,new Object[]{1}),1);
              if (true) break $try;
            }
            else {
              $line=70;
              if (($opEqualY($opAbsolY(state),3)&&$opMembrY(input,$opIntvlY('a','z')))) {
                $line=71;
                Object $v9=$getArrayValue(state,new Object[]{0});
                Object $v10=$getArrayValue(state,new Object[]{1});
                Object $v11=$getArrayValue(state,new Object[]{2});
                Object d=$fix($v9);
                Object s=$fix($v10);
                Object pos=$fix($v11);
                $line=72;
                $result=GCollections.asList(d,s,$opModulY($opAdditY(pos,1),d));
                if (true) break $try;
              }
              else {
                $line=73;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=76;
      $rethrow(new RuntimeException("The function \"\u03B4(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"\u03B4",$line);
    }
    return $result;
  }
  public static Object h(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=84;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=84;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=85;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=85;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=86;
          if ($opMembrY(state,GCollections.asSet(2,3,5,"I","E"))) {
            $line=86;
            $result="";
            if (true) break $try;
          }
          else {
            $line=87;
            if (($opEqualY($opAbsolY(state),2)&&$opEqualY(input,':'))) {
              $line=87;
              $result=":";
              if (true) break $try;
            }
            else {
              $line=88;
              if (($opEqualY($opAbsolY(state),3)&&$opMembrY(input,$opIntvlY('a','z')))) {
                $line=89;
                Object $v12=$getArrayValue(state,new Object[]{0});
                Object $v13=$getArrayValue(state,new Object[]{1});
                Object $v14=$getArrayValue(state,new Object[]{2});
                Object d=$fix($v12);
                Object s=$fix($v13);
                Object pos=$fix($v14);
                $line=90;
                if (($opEqualY(0,pos)&&$opEqualY(input,s))) {
                  $line=90;
                  $result="#";
                  if (true) break $try;
                }
                else {
                  $line=91;
                  if ($opEqualY(pos,1)) {
                    $line=91;
                    $result=$invokeMethod(CD3_2.class,"shiftSymbol",true,null,new Object[]{input,d});
                    if (true) break $try;
                  }
                  else {
                    $line=92;
                    $result=input;
                    if (true) break $try;
                  }
                }
              }
              else {
                $line=94;
                $result="";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=97;
      $rethrow(new RuntimeException("The function \"h(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"h",$line);
    }
    return $result;
  }
  public static Object g(Object s) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=104;
      $result="";
      if (true) break $try;
      $line=105;
      $rethrow(new RuntimeException("The function \"g(s:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"g",$line);
    }
    return $result;
  }
  public static ITransducer createDecoder() {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=108;
      gold.structures.set.ISet $v15=$newSet();
      $v16:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          for (Object pos:GCollections.unmodifiableCollection($opUnionY($opIntvlY(0,4),GCollections.asSet("_")))) {
            $v15.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object Q=$fix($opUnionY($v15,GCollections.asSet(3,2,5,"I","E")));
      $line=109;
      Object \u03A3_=$fix($opUnionY($opIntvlY('a','z'),GCollections.asSet(':','2','3','5')));
      $line=110;
      Object \u03A3=$fix($opUnionY(\u03A3_,GCollections.asSet('#')));
      $line=111;
      Object q_0=$fix("I");
      $line=112;
      gold.structures.set.ISet $v17=$newSet();
      $v18:for (Object d:GCollections.unmodifiableCollection(GCollections.asSet(3,2,5))) {
        for (Object s:GCollections.unmodifiableCollection($opIntvlY('a','z'))) {
          int $v19=$int(0);
          int $v20=$int(5)-1;
          for (int pos=$v19; pos<=$v20; pos++) {
            $v17.add(GCollections.asList(d,s,pos));
          }
        }
      }
      Object F=$fix($v17);
      $line=114;
      $result=$invokeMethod(CD3_2.class,"GDeterministicTransducer",true,null,new Object[]{Q,\u03A3,\u03A3_,q_0,F,new GMethod(CD3_2.class,"\u03B41"),new GMethod(CD3_2.class,"g"),new GMethod(CD3_2.class,"h1")});
      if (true) break $try;
      $line=115;
      $rethrow(new RuntimeException("The function \"createDecoder()\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"createDecoder",$line);
    }
    return $cast(ITransducer.class,$result);
  }
  public static Object \u03B41(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=121;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=121;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=122;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=122;
          $result=GCollections.asList(state,input,"_");
          if (true) break $try;
        }
        else {
          $line=123;
          $result="E";
          if (true) break $try;
        }
      }
      $line=125;
      $rethrow(new RuntimeException("The function \"\u03B41(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object \u03B41(java.lang.Iterable $v21, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v22=GCollections.unmodifiableCollection($v21).iterator();
      Object d=$v22.next();
      Object s=$v22.next();
      Object pos=$v22.next();
      $line=128;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=128;
        $result=GCollections.asList(d,s,1);
        if (true) break $try;
      }
      else {
        $line=129;
        if ($opEqualY(pos,"_")) {
          $line=129;
          $result="E";
          if (true) break $try;
        }
        else {
          $line=130;
          if (($opEqualY(input,'#')&&!$opEqualY(pos,0))) {
            $line=130;
            $result="E";
            if (true) break $try;
          }
          else {
            $line=131;
            if (($opEqualY(input,s)&&$opEqualY(pos,0))) {
              $line=131;
              $result="E";
              if (true) break $try;
            }
            else {
              $line=132;
              if ($opMembrY(input,$opUnionY($opIntvlY('a','z'),GCollections.asSet('#')))) {
                $line=132;
                $result=GCollections.asList(d,s,$opModulY($opAdditY(pos,1),d));
                if (true) break $try;
              }
              else {
                $line=133;
                $result="E";
                if (true) break $try;
              }
            }
          }
        }
      }
      $line=135;
      $rethrow(new RuntimeException("The function \"\u03B41(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"\u03B41",$line);
    }
    return $result;
  }
  public static Object h1(Object state, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=141;
      if (($opEqualY(state,"I")&&$opMembrY(input,GCollections.asSet('2','3','5')))) {
        $line=141;
        $result=$opSubtrY(input,'0');
        if (true) break $try;
      }
      else {
        $line=142;
        if (($opMembrY(state,GCollections.asSet(2,3,5))&&$opMembrY(input,$opIntvlY('a','z')))) {
          $line=142;
          $result=input;
          if (true) break $try;
        }
        else {
          $line=143;
          $result="";
          if (true) break $try;
        }
      }
      $line=145;
      $rethrow(new RuntimeException("The function \"h1(state:Object,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"h1",$line);
    }
    return $result;
  }
  public static Object h1(java.lang.Iterable $v23, Object input) {
    int $line=0;
    Object $result=null;
    $try:try {
      java.util.Iterator $v24=GCollections.unmodifiableCollection($v23).iterator();
      Object d=$v24.next();
      Object s=$v24.next();
      Object pos=$v24.next();
      $line=148;
      if (($opEqualY(pos,"_")&&$opEqualY(input,':'))) {
        $line=148;
        $result=input;
        if (true) break $try;
      }
      else {
        $line=149;
        if (($opEqualY(input,'#')&&$opEqualY(pos,0))) {
          $line=149;
          $result=s;
          if (true) break $try;
        }
        else {
          $line=150;
          if (($opMembrY(input,$opIntvlY('a','z'))&&$opEqualY(pos,1))) {
            $line=150;
            $result=$invokeMethod(CD3_2.class,"shiftSymbol",true,null,new Object[]{input,$opMinusY(d)});
            if (true) break $try;
          }
          else {
            $line=151;
            if ($opMembrY(input,$opIntvlY('a','z'))) {
              $line=151;
              $result=input;
              if (true) break $try;
            }
            else {
              $line=152;
              $result="";
              if (true) break $try;
            }
          }
        }
      }
      $line=154;
      $rethrow(new RuntimeException("The function \"h1(\u27E8d,s,pos\u27E9:java.lang.Iterable,input:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"h1",$line);
    }
    return $result;
  }
  public static Object shiftSymbol(Object symbol, Object shift) {
    int $line=0;
    Object $result=null;
    $try:try {
      $line=162;
      Character r=null;
      r=$defaultValue(Character.class);
      $line=164;
      if ($opMembrY(symbol,$opIntvlY('a','z'))) {
        $line=165;
        r=$cast(Character.class,$fix($opAdditY('a',$opModulY($opAdditY($opSubtrY(symbol,'a'),shift),26))));
      }
      else {
        $line=166;
        if ($opMembrY(symbol,$opIntvlY('A','Z'))) {
          $line=167;
          r=$cast(Character.class,$fix($opAdditY('A',$opModulY($opAdditY($opSubtrY(symbol,'A'),shift),26))));
        }
        else {
          $line=168;
          if ($opMembrY(symbol,$opIntvlY('0','9'))) {
            $line=169;
            r=$cast(Character.class,$fix($opAdditY('0',$opModulY($opAdditY($opSubtrY(symbol,'0'),shift),10))));
          }
          else {
            $line=170;
            r=$cast(Character.class,$fix(r));
          }
        }
      }
      $line=172;
      $result=r;
      if (true) break $try;
      $line=173;
      $rethrow(new RuntimeException("The function \"shiftSymbol(symbol:Object,shift:Object)\" did not return a value."));
    }
    catch (Throwable $throwable) {
      $rethrow($throwable,CD3_2.class,"shiftSymbol",$line);
    }
    return $result;
  }
}
