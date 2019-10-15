package com.springboot.constant.penghao;

public class BizOrBizExceptionConstant {
    public final static String INTERFACE_PACKAGE_URL = "com.ztgeo.general.entity.service_data.intface_param";
    public final static String OBLIGEE_TYPE_OF_QLR = "权利人";
    public final static String OBLIGEE_TYPE_OF_YWR = "义务人";
    public final static String OBLIGEE_TYPE_OF_DYQR = "抵押权人";
    public final static String OBLIGEE_TYPE_OF_DYR = "抵押人";
    public final static String OBLIGEE_TYPE_OF_SFZ = "售房者";
    public final static String OBLIGEE_TYPE_OF_GFZ = "购房者";
    public final static String IMMOVABLE_RIGHT_RECEIPT_SERVICE = "bdcqlxgxx";
    public final static String IMMOVABLE_MORTGAGE_RECEIPT_SERVICE = "bdcdyxgxx";
    public final static String TRANSACTION_CONTRACT_RECEIPT_SERVICE = "jyhtxx";
    public final static String MORTGAGE_CONTRACT_RECEIPT_SERVICE = "dyhtxx";
    public final static String TAXATION_RECEIPT_SERVICE = "qsxx";
    public final static String HANDLE_RESULT_SERVICE = "handleResult";
    public final static String IMMOVABLE_TYPE_OF_FD = "房地";
    //之前净地改成宗地
    public final static String IMMOVABLE_TYPE_OF_JD = "宗地";
    public final static String CERTIFICATE_TYPE_OF_BDC = "不动产权证";
    public final static String CERTIFICATE_TYPE_OF_FCTD = "房产土地证";
    public final static String POWER_LEVEL_WRITE = "Write";
    public final static String POWER_LEVEL_READ = "ReadOnly";
    public final static String POWER_LEVEL_NULL_WRITE = "WriteIfNull";
    public final static String POWER_LEVEL_NONE = "NoPower";
    public final static int ZTGEO_BIZ_ERROR_CODE = 20500;
    public final static String PACKAGE_URL_ERROR_MSG = "包路径不存在";
    public final static String PACKAGE_CLASSNOTFOUND_ERROR_MSG = "包内的文件不存在";
    public final static String PROCESS_STEP_NULL_ERROR_MSG = "传入流程步骤不可为空";
    public final static String PROCESS_STEP_RELATION_NULL_ERROR_MSG = "传入流程步骤关系不可为空";
    public final static String PROCESS_STEP_PROMOD_NULL_ERROR_MSG = "步骤所属流程不明确";
    public final static String PROCESS_STEP_SEND_STEPSELF_ERROR_MSG = "流程配置步骤不可配置为自身";
    public final static String PROCESS_STEP_FOUND_NULL = "未查询到流程相关步骤信息";
    public final static String PROCESS_STEP_RELATION_FOUND_NULL = "不合法的流程间关系";
    public final static String PROCESS_STEP_PARAM_NULL = "条件给定不合法";
    public final static String SERVICE_CODE_CAN_NOT_REPEAT = "服务标识已存在";
    public final static String SET_CAN_NOT_DELETE_MSG = "当前设置已产生办件，不可被删除，serviceCode项不可被更改";
    public final static String DATA_NO_MATCH_MSG = "结果异常，操作结果数目异常";
    public final static String DATA_PARAM_NULL_ERROR_MSG = "服务必填字段不可传入空值";
    public final static String DATA_INSERT_NOT_SUCCESS_MSG = "创建失败";
    public final static String DATA_UPDATE_NOT_SUCCESS_MSG = "保存失败";
    public final static String DATA_DISCARD_NOT_SUCCESS_MSG = "禁用失败";
    public final static String DATA_ENABLE_NOT_SUCCESS_MSG = "启用失败";
    public final static String DATA_DELETE_NOT_SUCCESS_MSG = "删除失败";
    public final static String FOUND_SAME_STEP_INTF_MSG = "已存在步骤接口权限，请勿重复操作";
    public final static String FOUND_SAME_STEP_SVR_MSG = "已存在步骤服务权限，请勿重复操作";
    public final static String FOUND_SAME_POSITION_STEP_MSG = "已存在岗位步骤权限，请勿重复操作";
    public final static String FOUND_SAME_SVR_INTF_MSG = "已存在服务接口权限，请勿重复操作";
    public final static String FOUND_SAME_POSITION_SVR_MSG = "已存在岗位服务权限，请勿重复操作";
    public final static String FOUND_SAME_ENTRY_POSITION_MSG = "已存在岗位条目权限，请勿重复操作";
    public final static String DATA_DATE_FORMAT_ERROR_MSG = "传入的日期格式异常";
    public final static String DATA_JSON_FORMAT_ERROR_MSG = "请传入正确格式的服务数据";
    public final static String DATA_TABLE_ERROR_MSG = "程序未定义的数据表标识";
    public final static String IMMOVABLE_TYPE_NOT_CLEAR = "不动产类型不明确，请确认不动产为房地或净地后提交";
    public final static String IMMOVABLE_TYPE_NOT_MATCH_ON_FD = "房地不动产类型不得传入净地信息";
    public final static String IMMOVABLE_TYPE_NOT_MATCH_ON_JD = "净地不动产类型不得传入房地信息";
    public final static String GET_IMMOVABLE_TYPE_NOT_CLEAR = "不明确的不动产类型";
    public final static String RECEIPT_INFO_NULL_ERROR = "保存的收件基础信息不可为空";
    public final static String RECEIPT_NUMBER_NULL_ERROR = "保存的收件编号不可为空";
    public final static String RECEIPT_TRANSACTION_CONTRACT_COUNT_ERROR = "交易合同只能选择一个，这里选择了多个";
    public final static String RECEIPT_MORTGAGE_CONTRACT_COUNT_ERROR = "抵押合同只能选择一个，这里选择了多个";
    public final static String RECEIPT_TAXATION_COUNT_ERROR = "地税收件信息只能存在一个，这里选择了多个";
    public final static String ACTIVITI_MODEL_FOUND = "该模板已经部署不得删除";
    public final static String SERVICE_NOT_MODULEID = "模板Id为空";
    public final static String SAVED_TASKID_IS_EMPTY = "数据保存未传入任务Id，保存失败";
    public final static String SAVED_TASK_MAPPING_STEP_IS_EMPTY = "任务无对应步骤";
    public final static String GET_DATA_BUT_SVRCODE_IS_NULL = "传入的服务标识为空";
    public final static String GET_DATA_BUT_SVRDATATO_IS_NULL = "未查询到服务数据表，保存失败";
    public final static String GET_DATA_BUT_RECEIPTNUM_IS_NULL = "传入的收件编号为空";
    public final static String TARGET_RECEIPT_IS_NULL = "查询的目标办件为空，请检查收件业务是否被正确生成";
    public final static String GET_TRANSACTION_CONTRACT_COUNT_ERROR = "查询的交易合同不唯一";
    public final static String GET_MORTGAGE_CONTRACT_COUNT_ERROR = "查询的抵押合同不唯一";
    public final static String GET_TAXATION_COUNT_ERROR = "查询到的地税信息不唯一";
    public final static String USER_STEP_POWER_OUT = "登录用户越权操作";
    public final static String RECEIPT_NUMBER_IS_NULL = "收件编号不可为空";
    public final static String STEP_SERVICE_POWER_OUT = "步骤服务越权操作";
    public final static String SERVICE_INTERFACE_POWER_OUT = "服务接口越权操作";
    public final static String SERVICE_USER_POWER_OUT = "用户服务越权操作";
    public final static String CERTIFICATE_NO_TYPE_ERROR = "不动产证号和房产证土地证不可同时提交";
    public final static String CERTIFICATE_NO_NOT_ENOUGH = "权利信息服务数据缺失证书权证号";
    public final static String CERTIFICATE_NO_AND_TYPE_NOT_MATCH = "权证信息与传入的证书类型不匹配";
    public final static String CERTIFICATE_TYPE_NOT_LEGITIMATE = "证书类型不合法";
    public final static String CERTIFICATE_TYPE_IS_NULL = "证书类型不可为空";
    public final static String INPUT_SAME_CERT_NO = "传入重复的不动产或房产土地证号";
    public final static String MORTGAGE_NO_NOT_ENOUGH = "不动产抵押信息服务数据缺失证明号";
    public final static String INPUT_SAME_MORTGAGE_CERT_NO = "传入重复的不动产抵押证明号";
    public final static String UPDATE_BDC_CERT_NO_NOT_EXIST = "要求更新的不动产权属信息不存在";
    public final static String UPDATE_BDC_MORTGAGE_NO_NOT_EXIST = "要求更新的不动产抵押信息不存在";
    public final static String MORTGAGE_CONTRACT_IS_EXIST = "该收件已存在抵押合同信息，禁止合同信息重复插入";
    public final static String UPDATE_MORTGAGE_CONTRACT_NOT_EXIST = "要求更新的抵押合同信息不存在";
    public final static String TRANSACTION_CONTRACT_IS_EXIST = "该收件已存在交易合同信息，禁止合同信息重复插入";
    public final static String UPDATE_TRANSACTION_CONTRACT_NOT_EXIST = "要求更新的交易合同信息不存在";
    public final static String TAX_INFO_IS_EXIST = "该收件已存在地税信息，禁止地税信息重复插入";
    public final static String UPDATE_TAX_INFO_NOT_EXIST = "要求更新的地税信息不存在";
    public final static String UPDATE_HANDLE_RESULT_NOT_EXIST = "要求更新的收件处理结果信息不存在";
    public final static String REQUEST_METHOD_OUT = "不合法的http请求方式";
    public final static String HTTP_RESPONSE_NULL = "接口返回值异常";
    public final static String INTF_REQUEST_INTF_ID_NULL = "传入的执行接口ID不可为空";
    public final static String INTERFACE_IS_INVALID = "接口失效";
    public final static String TASK_IS_ALREADY_DEAL = "任务不是本人提交请检查";
    public final static String RECIEVE_DATA_CAN_NOT_USED = "请传入正确数据";
    public final static String DO_NOT_HAVE_THIS_RECORDE = "查无此件";
    public final static String CAN_NOT_GET_RECEIPT_FROM_TASK = "无法查询到任务所属有效办件信息";
}
