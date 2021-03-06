package com.runescape.revised;

import java.lang.System;

/**
 * The GarbageCollector that collects any
 * garbage (nulls) in the program.
 * 
 * @author Josh
 *
 */
public class GarbageCollector {

	/**
	 * The GarbageCollector constructor.
	 */
	public GarbageCollector() {
		System.gc();
		System.runFinalization();
	}
}