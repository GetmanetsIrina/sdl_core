//
//  MBServer.h
//  MsgBrokerTest
//
//  Created by Eugene Nikolsky on 6/27/12.
//  Copyright (c) 2012 Luxoft. All rights reserved.
//

#import <Foundation/Foundation.h>
#import "MBMessageBroker.h"

/* The server class that communicates with clients and the
 message broker. */
@interface MBServer : NSObject <MBMessageBrokerSender>

// The constructor that you should use
// NB! the messageBroker will NOT be deleted by this object
- (id)initWithHost:(NSString *)host port:(uint16_t)port andMessageBroker:(MBMessageBroker *)messageBroker;

// Starts listening on the specified port.
- (BOOL)listen;

// Stops listening for incoming connections.
- (void)stop;
// Stops the server at once, w/o any scheduled reading/writing.
- (void)stopImmediately;

@end
