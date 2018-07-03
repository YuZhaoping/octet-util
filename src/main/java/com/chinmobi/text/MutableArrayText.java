/**
 * MIT License
 *
 * Copyright (c) 2018 Zhaoping Yu
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 *
 */
package com.chinmobi.text;

import com.chinmobi.octet.data.ArrayData;

/**
 * @author <a href="mailto:yuzhaoping1970@gmail.com">Zhaoping Yu</a>
 *
 */
public class MutableArrayText extends AbstractMutableTextOctet {


	public MutableArrayText() {
		super(new ArrayData());
	}

	public MutableArrayText(final int size) {
		super(new ArrayData(new byte[size]));
	}

	public MutableArrayText(final MutableArrayText source) {
		super((AbstractMutableTextOctet)source);
	}


	public MutableArrayText set(final MutableArrayText source) {
		super.set((AbstractMutableTextOctet)source);
		return this;
	}

	public MutableArrayText swap(final MutableArrayText another) {
		super.swap((AbstractMutableTextOctet)another);
		return this;
	}


	protected final ArrayData data() {
		return (ArrayData)this.data;
	}

}
