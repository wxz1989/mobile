// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.2 by WSRD Tencent.
// Generated from `/usr/local/resin_system.mqq.com/webapps/communication/taf/upload/renjunyi/MTT.jce'
// **********************************************************************

#import "JceObjectV2.h"

@interface MttUpdateRsp : JceObjectV2

@property (nonatomic, assign, JV2_PROP_GS_V2(iStatus,setIStatus:)) JceInt32 JV2_PROP_NM(r,0,iStatus);
@property (nonatomic, retain, JV2_PROP_GS_V2(sURL,setSURL:)) NSString* JV2_PROP_NM(r,1,sURL);
@property (nonatomic, retain, JV2_PROP_GS_V2(sText,setSText:)) NSString* JV2_PROP_NM(r,2,sText);
@property (nonatomic, retain, JV2_PROP_GS_V2(sMark,setSMark:)) NSString* JV2_PROP_NM(o,3,sMark);
@property (nonatomic, assign, JV2_PROP_GS_V2(iFreq,setIFreq:)) JceInt32 JV2_PROP_NM(o,4,iFreq);

@end