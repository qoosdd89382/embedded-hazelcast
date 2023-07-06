.   ____          _            __ _ _
/\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
\\/  ___)| |_)| | | | | || (_| |  ) ) ) )
'  |____| .__|_| |_|_| |_\__, | / / / /
=========|_|==============|___/=/_/_/_/
:: Spring Boot ::                (v2.7.9)

2023-07-06 16:18:19.439  INFO 1 --- [           main] c.cherry.hazelcast.HazelcastApplication  : Starting HazelcastApplication v0.0.1-SNAPSHOT using Java 1.8.0_212 on embedded-hazelcast-6bc9b88b8c-jwj66 with PID 1 (/embedded-hazelcast.jar started by root in /)
2023-07-06 16:18:19.444  INFO 1 --- [           main] c.cherry.hazelcast.HazelcastApplication  : No active profile set, falling back to 1 default profile: "default"
2023-07-06 16:18:23.150  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat initialized with port(s): 8888 (http)
2023-07-06 16:18:23.238  INFO 1 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2023-07-06 16:18:23.238  INFO 1 --- [           main] org.apache.catalina.core.StandardEngine  : Starting Servlet engine: [Apache Tomcat/9.0.71]
2023-07-06 16:18:24.061  INFO 1 --- [           main] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring embedded WebApplicationContext
2023-07-06 16:18:24.062  INFO 1 --- [           main] w.s.c.ServletWebServerApplicationContext : Root WebApplicationContext: initialization completed in 4510 ms
2023-07-06 16:18:24.746  INFO 1 --- [           main] com.hazelcast.system.logo                : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5]
+       +  o    o     o     o---o o----o o      o---o     o     o----o o--o--o
+ +   + +  |    |    / \       /  |      |     /         / \    |         |   
+ + + + +  o----o   o   o     o   o----o |    o         o   o   o----o    |   
+ +   + +  |    |  /     \   /    |      |     \       /     \       |    |   
+       +  o    o o       o o---o o----o o----o o---o o       o o----o    o   
2023-07-06 16:18:24.746  INFO 1 --- [           main] com.hazelcast.system                     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Copyright (c) 2008-2022, Hazelcast, Inc. All Rights Reserved.
2023-07-06 16:18:24.746  INFO 1 --- [           main] com.hazelcast.system                     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Hazelcast Platform 5.1.5 (20221114 - c52d6ff) starting at [10.244.0.4]:5701
2023-07-06 16:18:24.747  INFO 1 --- [           main] com.hazelcast.system                     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Cluster name: spring-session-cluster
2023-07-06 16:18:24.747  INFO 1 --- [           main] com.hazelcast.system                     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Integrity Checker is disabled. Fail-fast on corrupted executables will not be performed.
To enable integrity checker do one of the following:
- Change member config using Java API: config.setIntegrityCheckerEnabled(true);
- Change XML/YAML configuration property: Set hazelcast.integrity-checker.enabled to true
- Add system property: -Dhz.integritychecker.enabled=true (for Hazelcast embedded, works only when loading config via Config.load)
- Add environment variable: HZ_INTEGRITYCHECKER_ENABLED=true (recommended when running container image. For Hazelcast embedded, works only when loading config via Config.load)
  2023-07-06 16:18:24.751  INFO 1 --- [           main] com.hazelcast.system                     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] The Jet engine is disabled.
  To enable the Jet engine on the members, do one of the following:
- Change member config using Java API: config.getJetConfig().setEnabled(true)
- Change XML/YAML configuration property: Set hazelcast.jet.enabled to true
- Add system property: -Dhz.jet.enabled=true (for Hazelcast embedded, works only when loading config via Config.load)
- Add environment variable: HZ_JET_ENABLED=true (recommended when running container image. For Hazelcast embedded, works only when loading config via Config.load)
  2023-07-06 16:18:25.951  INFO 1 --- [           main] c.h.s.d.integration.DiscoveryService     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Auto-detection selected discovery strategy: class com.hazelcast.kubernetes.HazelcastKubernetesDiscoveryStrategyFactory
  2023-07-06 16:18:25.957  INFO 1 --- [           main] c.h.s.d.integration.DiscoveryService     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Kubernetes Discovery properties: { service-dns: null, service-dns-timeout: 5, service-name: null, service-port: 0, service-label: null, service-label-value: true, namespace: default, pod-label: null, pod-label-value: null, resolve-not-ready-addresses: true, expose-externally-mode: AUTO, use-node-name-as-external-address: false, service-per-pod-label: null, service-per-pod-label-value: null, kubernetes-api-retries: 3, kubernetes-master: https://kubernetes.default.svc}
  2023-07-06 16:18:26.337  INFO 1 --- [           main] c.h.s.d.integration.DiscoveryService     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Kubernetes Discovery activated with mode: KUBERNETES_API
  2023-07-06 16:18:26.338  INFO 1 --- [           main] com.hazelcast.system.security            : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Enable DEBUG/FINE log level for log category com.hazelcast.system.security  or use -Dhazelcast.security.recommendations system property to see 🔒 security recommendations and the status of current config.
  2023-07-06 16:18:26.538  INFO 1 --- [           main] com.hazelcast.instance.impl.Node         : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Using Discovery SPI
  2023-07-06 16:18:26.546  WARN 1 --- [           main] com.hazelcast.cp.CPSubsystem             : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] CP Subsystem is not enabled. CP data structures will operate in UNSAFE mode! Please note that UNSAFE mode will not provide strong consistency guarantees.
  2023-07-06 16:18:27.462  INFO 1 --- [           main] c.h.internal.diagnostics.Diagnostics     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Diagnostics disabled. To enable add -Dhazelcast.diagnostics.enabled=true to the JVM arguments.
  2023-07-06 16:18:27.467  INFO 1 --- [           main] com.hazelcast.core.LifecycleService      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] [10.244.0.4]:5701 is STARTING
  2023-07-06 16:18:27.562  INFO 1 --- [           main] c.h.s.d.integration.DiscoveryService     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Cannot fetch the current zone, ZONE_AWARE feature is disabled
  2023-07-06 16:18:27.573  WARN 1 --- [           main] c.h.s.d.integration.DiscoveryService     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Cannot fetch name of the node, NODE_AWARE feature is disabled
  2023-07-06 16:18:27.641  WARN 1 --- [           main] c.hazelcast.kubernetes.KubernetesClient  : Kubernetes API access is forbidden! Starting standalone. To use Hazelcast Kubernetes discovery, configure the required RBAC. For 'default' service account in 'default' namespace execute: `kubectl apply -f https://raw.githubusercontent.com/hazelcast/hazelcast/master/kubernetes-rbac.yaml`
  2023-07-06 16:18:32.608  INFO 1 --- [           main] c.h.internal.cluster.ClusterService      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5]

Members {size:1, ver:1} [
Member [10.244.0.4]:5701 - 02b00347-e6a4-4058-b27e-ef6b9618321e this
]

2023-07-06 16:18:32.624  INFO 1 --- [           main] com.hazelcast.core.LifecycleService      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] [10.244.0.4]:5701 is STARTED
2023-07-06 16:18:32.685  INFO 1 --- [           main] c.h.i.p.impl.PartitionStateManager       : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Initializing cluster partition table arrangement...
2023-07-06 16:18:33.444  INFO 1 --- [           main] o.s.b.w.embedded.tomcat.TomcatWebServer  : Tomcat started on port(s): 8888 (http) with context path ''
2023-07-06 16:18:33.464  INFO 1 --- [           main] c.cherry.hazelcast.HazelcastApplication  : Started HazelcastApplication in 15.821 seconds (JVM running for 16.915)
2023-07-06 16:25:27.538  WARN 1 --- [cached.thread-2] c.hazelcast.kubernetes.KubernetesClient  : Cannot fetch public IPs of Hazelcast Member PODs, you won't be able to use Hazelcast Smart Client from outside of the Kubernetes network
2023-07-06 16:25:27.578  INFO 1 --- [.IO.thread-in-0] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Initialized new cluster connection between /10.244.0.4:46653 and /10.244.0.5:5701
2023-07-06 16:25:27.641  INFO 1 --- [cached.thread-2] c.h.i.cluster.impl.ClusterJoinManager    : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] [10.244.0.5]:5701 should merge to us, both have the same data member count: 1
2023-07-06 16:25:27.737  INFO 1 --- [.IO.thread-in-1] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Initialized new cluster connection between /10.244.0.4:55461 and /10.244.0.3:5701
2023-07-06 16:25:27.754  INFO 1 --- [cached.thread-2] c.h.i.cluster.impl.ClusterJoinManager    : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] We should merge to [10.244.0.3]:5701, both have the same data member count: 1
2023-07-06 16:25:27.755  WARN 1 --- [cached.thread-2] c.h.i.cluster.impl.DiscoveryJoiner       : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] [10.244.0.4]:5701 is merging [tcp/ip] to [10.244.0.3]:5701
2023-07-06 16:25:27.766  INFO 1 --- [cached.thread-2] c.h.i.c.i.operations.LockClusterStateOp  : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Locking cluster state. Initiator: [10.244.0.4]:5701, lease-time: 60000
2023-07-06 16:25:27.767  INFO 1 --- [cached.thread-2] c.h.i.c.i.operations.LockClusterStateOp  : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Extending cluster state lock. Initiator: [10.244.0.4]:5701, lease-time: 20000
2023-07-06 16:25:27.768  INFO 1 --- [cached.thread-2] c.h.i.c.i.o.CommitClusterStateOp         : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Changing cluster state from ClusterState{state=ACTIVE, lock=LockGuard{lockOwner=[10.244.0.4]:5701, lockOwnerId='190b6ff6-1360-4a70-97a8-bc41df425b1d', lockExpiryTime=1688660807766}} to ClusterStateChange{type=class com.hazelcast.cluster.ClusterState, newState=FROZEN}, initiator: [10.244.0.4]:5701, transient: false
2023-07-06 16:25:27.769  WARN 1 --- [cached.thread-2] c.h.i.c.impl.operations.MergeClustersOp  : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] [10.244.0.4]:5701 is merging to [10.244.0.3]:5701, because: instructed by master [10.244.0.4]:5701
2023-07-06 16:25:27.836  INFO 1 --- [cached.thread-2] com.hazelcast.core.LifecycleService      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] [10.244.0.4]:5701 is MERGING
2023-07-06 16:25:27.838  WARN 1 --- [cached.thread-2] c.h.internal.cluster.ClusterService      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Resetting local member UUID. Previous: 02b00347-e6a4-4058-b27e-ef6b9618321e, new: 0be58b27-49bd-45ba-96d0-5b93f833b8db
2023-07-06 16:25:27.841  INFO 1 --- [cached.thread-2] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Connection[id=2, /10.244.0.4:55461->/10.244.0.3:5701, qualifier=null, endpoint=[10.244.0.3]:5701, remoteUuid=9c614313-30e4-4e8b-9229-b66176025734, alive=false, connectionType=MEMBER, planeIndex=0] closed. Reason: TcpServer is stopping
2023-07-06 16:25:27.843  INFO 1 --- [cached.thread-2] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Connection[id=1, /10.244.0.4:46653->/10.244.0.5:5701, qualifier=null, endpoint=[10.244.0.5]:5701, remoteUuid=6d2082fa-8bb5-4715-8c18-8bda61aff06d, alive=false, connectionType=MEMBER, planeIndex=0] closed. Reason: TcpServer is stopping
2023-07-06 16:25:28.153  INFO 1 --- [cached.thread-6] c.h.i.server.tcp.TcpServerConnector      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Connecting to /10.244.0.3:5701, timeout: 10000, bind-any: true
2023-07-06 16:25:28.159  INFO 1 --- [.IO.thread-in-2] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Initialized new cluster connection between /10.244.0.4:56447 and /10.244.0.3:5701
2023-07-06 16:25:28.166  INFO 1 --- [cached.thread-6] c.h.i.server.tcp.TcpServerConnector      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Connecting to /10.244.0.3:5701, timeout: 10000, bind-any: true
2023-07-06 16:25:28.168  INFO 1 --- [.IO.thread-in-0] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Initialized new cluster connection between /10.244.0.4:55367 and /10.244.0.3:5701
2023-07-06 16:25:33.376  INFO 1 --- [ration.thread-0] c.h.internal.cluster.ClusterService      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5]

Members {size:3, ver:3} [
Member [10.244.0.3]:5701 - 9c614313-30e4-4e8b-9229-b66176025734
Member [10.244.0.4]:5701 - 0be58b27-49bd-45ba-96d0-5b93f833b8db this
Member [10.244.0.5]:5701 - 756054d0-1d25-4077-b2fb-835faea92fa3
]

2023-07-06 16:25:33.378  INFO 1 --- [cached.thread-3] c.h.i.server.tcp.TcpServerConnector      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Connecting to /10.244.0.5:5701, timeout: 10000, bind-any: true
2023-07-06 16:25:33.379  INFO 1 --- [.IO.thread-in-2] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Initialized new cluster connection between /10.244.0.4:5701 and /10.244.0.5:43045
2023-07-06 16:25:33.383  INFO 1 --- [.IO.thread-in-1] c.h.i.server.tcp.TcpServerConnection     : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] Initialized new cluster connection between /10.244.0.4:50425 and /10.244.0.5:5701
2023-07-06 16:25:34.741  INFO 1 --- [cached.thread-2] com.hazelcast.core.LifecycleService      : [10.244.0.4]:5701 [spring-session-cluster] [5.1.5] [10.244.0.4]:5701 is MERGED

