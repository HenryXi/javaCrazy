package mAnnotation.No14_2_1;

import java.lang.annotation.*;
/**
 * Description:
 * <br/>Copyright (C), 2005-2008, Yeeku.H.Lee
 * <br/>This program is protected by copyright laws.
 * <br/>Program Name:
 * <br/>Date:
 * @author  Yeeku.H.Lee kongyeeku@163.com
 * @version  1.0
 */
 
@Retention(RetentionPolicy.RUNTIME)    
@Target(ElementType.METHOD)
//����һ�����ע�ͣ��������κγ�Ա�����������ɴ���Ԫ����
public @interface Testable 
{
}