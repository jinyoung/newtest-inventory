
#### Object: basic
#### Type: Deployment

### Cluster에 basic Deployment를 생성하려면 아래의 명령어를 실행하세요.

```
$ kubectl create -f https://minio.msaez.io/labs-msaez.io/yamlStorage/newtest/jyjang%40uengine.org/Deployment/basic.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230807%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230807T095202Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=c3dd4354365d98dfe7d4ec3a0c5d24796dd9cf495780e2849a54964689ecd1ff
```
- Yaml 파일에 명시된 스펙으로 basic Deployment를 생성합니다.

```
$ kubectl apply -f https://minio.msaez.io/labs-msaez.io/yamlStorage/newtest/jyjang%40uengine.org/Deployment/basic.yaml?X-Amz-Algorithm=AWS4-HMAC-SHA256&X-Amz-Credential=minio%2F20230807%2Fus-east-1%2Fs3%2Faws4_request&X-Amz-Date=20230807T095202Z&X-Amz-Expires=60&X-Amz-SignedHeaders=host&X-Amz-Signature=c3dd4354365d98dfe7d4ec3a0c5d24796dd9cf495780e2849a54964689ecd1ff
```
- Create가 된 상태라면 basic Deployment의 수정이 이루어지고, Create가 된 상태가 아니라면 basic Deployment를 Create 해주는 명령어입니다.  
#

### basic Deployment가 정상적으로 생성되었는지 확인하시려면 아래의 명령어를 실행하세요.

```
$ kubectl get Deployment

NAME            READY   UP-TO-DATE   AVAILABLE   AGE
basic           3/3     3            3           5m43s

```
- basic Deployment와 Pod, Replicaset이 모두 확인이 된다면 정상적으로 생성된 것입니다.
#

### 생성된 basic Deployment의 상세 실행 정보를 확인하시려면 아래의 명령어를 입력하세요.

```
$ kubectl describe Deployment basic
```
- basic Deployment의 상태를 확인하여 문제가 있는지 확인합니다. 
#

### Kubernetes Cluster network 외부에서 service에 access할 때, 해당 명령어로 외부 IP traffic을 허용할 수 있습니다.

```
$ kubectl port-forward Deployment/basic 8080:8080
```
#

### basic Deployment를 삭제하려면 아래의 명령어를 실행하세요.

```
$ kubectl delete Deployment basic
```
#

