// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 1.5.1 by WSRD Tencent.
// Generated from `/usr/local/resin_system.mqq.com/webapps/communication/taf/upload/MiniGameProto_new.jce'
// **********************************************************************

package MiniGameProto;

public final class TMsgRequestQueryTable extends com.qq.taf.jce.JceStruct
{
    public String className()
    {
        return "MiniGameProto.TMsgRequestQueryTable";
    }

    public short nRoomID = (short)0;

    public short nTableID = (short)0;

    public short getNRoomID()
    {
        return nRoomID;
    }

    public void  setNRoomID(short nRoomID)
    {
        this.nRoomID = nRoomID;
    }

    public short getNTableID()
    {
        return nTableID;
    }

    public void  setNTableID(short nTableID)
    {
        this.nTableID = nTableID;
    }

    public TMsgRequestQueryTable()
    {
    }

    public TMsgRequestQueryTable(short nRoomID, short nTableID)
    {
        this.nRoomID = nRoomID;
        this.nTableID = nTableID;
    }

    public boolean equals(Object o)
    {
        TMsgRequestQueryTable t = (TMsgRequestQueryTable) o;
        return (
            com.qq.taf.jce.JceUtil.equals(nRoomID, t.nRoomID) && 
            com.qq.taf.jce.JceUtil.equals(nTableID, t.nTableID) );
    }

    public void writeTo(com.qq.taf.jce.JceOutputStream _os)
    {
        try
        {
            _os.write(nRoomID, 0);
            _os.write(nTableID, 1);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void readFrom(com.qq.taf.jce.JceInputStream _is)
    {
        try
        {
            nRoomID = 0;
            nRoomID = (short) _is.read(nRoomID, 0, true);

            nTableID = 0;
            nTableID = (short) _is.read(nTableID, 1, true);

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void display(java.lang.StringBuffer _os, int _level)
    {
    }

}
