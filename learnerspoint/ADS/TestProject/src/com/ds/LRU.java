package com.ds;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.python.modules.synchronize;

class Business
{

}

public class LRU {

	Integer count = 0;
	final int constantsize = 100;
	List<Integer> lruq = new ArrayList<Integer>();
	HashMap<Business,Integer> cache = new HashMap<Business,Integer>();

	public boolean isRestriceted(Business key)
	{
		try
		{
			synchronized(this)
			{
				Integer index = null;
				index = cache.get(key);
				if(index != null)
				{
					if(lruq.size() >= constantsize)
					{
						if(lruq.contains(index))
						{
							lruq.remove(index);
							lruq.add(index);
						}
						lruq.remove(0);
						lruq.add(index);

					}

					lruq.add(index);
					return true;
				}

				// retrieve the data from DB
				/*
				 * 
				 * if key is not in table return false;
				 */

				if(count > constantsize)
					count = 0;
				int newcount = count + 1;


				for(Business b : cache.keySet())
				{
					if(cache.get(b) == lruq.get(0))
					{
						cache.remove(b);
						break;
					}
				}

				cache.put(key, newcount);

				lruq.remove(0);
				lruq.add(newcount);

				return true;
			}
		}
		catch(Exception e)
		{
			// get the exact value from DB and return true. If not found return false;
			return false;
		}
	}

}
