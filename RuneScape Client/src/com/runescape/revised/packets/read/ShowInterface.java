package com.runescape.revised.packets.read;

import com.runescape.revised.client.GameClient;
import com.runescape.revised.packets.Packet;

public class ShowInterface extends Packet {

	@Override
	public void executePacket(GameClient c, int packetType, int packetSize) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public short getOpcode() {
		// TODO Auto-generated method stub
		return 97;
	}
	
	@Override
	public byte getSize() {
		return 0;
	}

	/**
	 * 
		if(pktType == 97)
		{
			int l7 = inStream.readUnsignedWord();
			method60(l7);
			if(invOverlayInterfaceID != -1)
			{
				invOverlayInterfaceID = -1;
				needDrawTabArea = true;
				tabAreaAltered = true;
			}
			if(backDialogID != -1)
			{
				backDialogID = -1;
				inputTaken = true;
			}
			if(inputDialogState != 0)
			{
				inputDialogState = 0;
				inputTaken = true;
			}
			openInterfaceID = l7;
			aBoolean1149 = false;
			pktType = -1;
			return true;
		}
	 */
}
