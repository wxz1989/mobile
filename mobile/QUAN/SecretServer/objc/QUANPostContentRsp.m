// **********************************************************************
// This file was generated by a TAF parser!
// TAF version 2.1.4.3 by WSRD Tencent.
// Generated from `SecretBase.jce'
// **********************************************************************

#import "QUANPostContentRsp.h"

@implementation QUANPostContentRsp

@synthesize JV2_PROP_NM(o,0,iStatus);
@synthesize JV2_PROP_NM(o,1,tContent);

+ (void)initialize
{
    if (self == [QUANPostContentRsp class]) {
        [QUANContentInfo initialize];
        [super initialize];
    }
}

- (id)init
{
    if (self = [super init]) {
    }
    return self;
}

- (void)dealloc
{
    JV2_PROP(tContent) = nil;
    [super dealloc];
}

+ (NSString*)jceType
{
    return @"QUAN.PostContentRsp";
}

@end
