package com.infrastructure.distributed.redisson;

public interface RedisDistributedService {
    RedisDistributedLocker getDistributedLock(String lockKey);
}
