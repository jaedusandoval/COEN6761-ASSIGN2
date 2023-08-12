/* $$ This file has been instrumented by Clover 4.4.0#2019092621413129 $$ */package coen6761.group.assign2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class IntArrayBasedListTest {static class __CLR4_4_0pplkvyivk5{public static com_atlassian_clover.CoverageRecorder R;public static com_atlassian_clover.CloverProfile[] profiles = { };@java.lang.SuppressWarnings("unchecked") public static <I, T extends I> I lambdaInc(final int i,final T l,final int si){java.lang.reflect.InvocationHandler h=new java.lang.reflect.InvocationHandler(){public java.lang.Object invoke(java.lang.Object p,java.lang.reflect.Method m,java.lang.Object[] a) throws Throwable{R.inc(i);R.inc(si);try{return m.invoke(l,a);}catch(java.lang.reflect.InvocationTargetException e){throw e.getCause()!=null?e.getCause():new RuntimeException("Clover failed to invoke instrumented lambda",e);}}};return (I)java.lang.reflect.Proxy.newProxyInstance(l.getClass().getClassLoader(),l.getClass().getInterfaces(),h);}static{com_atlassian_clover.CoverageRecorder _R=null;try{com_atlassian_clover.CloverVersionInfo.An_old_version_of_clover_is_on_your_compilation_classpath___Please_remove___Required_version_is___4_4_0();if(2019092621413129L!=com_atlassian_clover.CloverVersionInfo.getBuildStamp()){com_atlassian_clover.Clover.l("[CLOVER] WARNING: The Clover version used in instrumentation does not match the runtime version. You need to run instrumented classes against the same version of Clover that you instrumented with.");com_atlassian_clover.Clover.l("[CLOVER] WARNING: Instr=4.4.0#2019092621413129,Runtime="+com_atlassian_clover.CloverVersionInfo.getReleaseNum()+"#"+com_atlassian_clover.CloverVersionInfo.getBuildStamp());}R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getNullRecorder();_R=com_atlassian_clover.Clover.getRecorder("\u0043\u003a\u005c\u005c\u0043\u006f\u0064\u0065\u005c\u005c\u0063\u006f\u0065\u006e\u0036\u0037\u0036\u0031\u005c\u005c\u0061\u0073\u0073\u0069\u0067\u006e\u0032\u005c\u005c\u0061\u0073\u0073\u0069\u0067\u006e\u0032\u005c\u005c\u0074\u0061\u0072\u0067\u0065\u0074\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002f\u0063\u006c\u006f\u0076\u0065\u0072\u002e\u0064\u0062",1691115531839L,8589935092L,39,profiles,new java.lang.String[]{"clover.distributed.coverage",null});}catch(java.lang.SecurityException e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because it has insufficient security privileges. Please consult the Clover documentation on the security policy file changes required. ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.NoClassDefFoundError e){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised. Are you sure you have Clover in the runtime classpath? ("+e.getClass()+":"+e.getMessage()+")");}catch(java.lang.Throwable t){java.lang.System.err.println("[CLOVER] FATAL ERROR: Clover could not be initialised because of an unexpected error. ("+t.getClass()+":"+t.getMessage()+")");}R=_R;}}public static final com_atlassian_clover.TestNameSniffer __CLR4_4_0_TEST_NAME_SNIFFER=com_atlassian_clover.TestNameSniffer.NULL_INSTANCE;
	
	static IntArrayBasedList iList; 

	@BeforeAll
	public static void setUp() throws Exception {try{__CLR4_4_0pplkvyivk5.R.inc(25);
		__CLR4_4_0pplkvyivk5.R.inc(26);iList = new IntArrayBasedList();
	}finally{__CLR4_4_0pplkvyivk5.R.flushNeeded();}}

	@Test
	void testInsert() {__CLR4_4_0pplkvyivk5.R.globalSliceStart(getClass().getName(),27);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0adr9w2r();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_0pplkvyivk5.R.rethrow($CLV_t2$);}finally{__CLR4_4_0pplkvyivk5.R.globalSliceEnd(getClass().getName(),"coen6761.group.assign2.IntArrayBasedListTest.testInsert",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),27,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0adr9w2r(){try{__CLR4_4_0pplkvyivk5.R.inc(27);
		__CLR4_4_0pplkvyivk5.R.inc(28);assertEquals(true, iList.insert(1, 100)); 
		__CLR4_4_0pplkvyivk5.R.inc(29);assertEquals(false,iList.insert(1, 100)); // already insert
		__CLR4_4_0pplkvyivk5.R.inc(30);assertEquals(false,iList.insert(-1, 100)); // out of range
		__CLR4_4_0pplkvyivk5.R.inc(31);assertEquals(false, iList.insert(1000, 100)); 
	
	
	}finally{__CLR4_4_0pplkvyivk5.R.flushNeeded();}}
	
	@Test
	void testFind() {__CLR4_4_0pplkvyivk5.R.globalSliceStart(getClass().getName(),32);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0b6e5w2w();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_0pplkvyivk5.R.rethrow($CLV_t2$);}finally{__CLR4_4_0pplkvyivk5.R.globalSliceEnd(getClass().getName(),"coen6761.group.assign2.IntArrayBasedListTest.testFind",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),32,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0b6e5w2w(){try{__CLR4_4_0pplkvyivk5.R.inc(32);
		__CLR4_4_0pplkvyivk5.R.inc(33);iList.insert(0, 100);
		__CLR4_4_0pplkvyivk5.R.inc(34);assertEquals(true, iList.find(0) ); // already insert
		__CLR4_4_0pplkvyivk5.R.inc(35);assertEquals(false, iList.find(1));
	}finally{__CLR4_4_0pplkvyivk5.R.flushNeeded();}}
	

	
	@Test
	void testRemove() {__CLR4_4_0pplkvyivk5.R.globalSliceStart(getClass().getName(),36);int $CLV_p$=0;java.lang.Throwable $CLV_t$=null;try{__CLR4_4_0ej1cn110();$CLV_p$=1;}catch(java.lang.Throwable $CLV_t2$){if($CLV_p$==0&&$CLV_t$==null){$CLV_t$=$CLV_t2$;}__CLR4_4_0pplkvyivk5.R.rethrow($CLV_t2$);}finally{__CLR4_4_0pplkvyivk5.R.globalSliceEnd(getClass().getName(),"coen6761.group.assign2.IntArrayBasedListTest.testRemove",__CLR4_4_0_TEST_NAME_SNIFFER.getTestName(),36,$CLV_p$,$CLV_t$);}}private void  __CLR4_4_0ej1cn110(){try{__CLR4_4_0pplkvyivk5.R.inc(36);
		__CLR4_4_0pplkvyivk5.R.inc(37);iList.insert(0, 100);
		__CLR4_4_0pplkvyivk5.R.inc(38);assertEquals(false, iList.remove(0));
	}finally{__CLR4_4_0pplkvyivk5.R.flushNeeded();}}

}
