package net.underrealm.net;

public class Stream {

	public byte[] inBuffer;
	public byte[] outBuffer;
	public int inOffset = 0;
	public int outOffset = 0;
	public int bitPosition = 0;

	public Stream(int inCapacity, int outCapacity) {
		inBuffer = new byte[inCapacity];
		outBuffer = new byte[outCapacity];
	}

	public void writeInt(int i) {

	}

	public void writeByte(int i) {
		outBuffer[outOffset++] = (byte) i;
	}
}
