package com.griftt.lifemix.core.extends.interceptor



    import cn.hutool.core.collection.CollectionUtil
    import com.baomidou.mybatisplus.core.toolkit.PluginUtils
    import org.apache.ibatis.executor.statement.StatementHandler
    import org.apache.ibatis.mapping.BoundSql
    import org.apache.ibatis.mapping.MappedStatement
    import org.apache.ibatis.mapping.SqlCommandType
    import org.apache.ibatis.plugin.*
    import org.apache.ibatis.reflection.MetaObject
    import org.apache.ibatis.reflection.SystemMetaObject

    import java.sql.Connection
    import java.util.Properties

    /**
     * 数据范围的拦截器
     *
     * @author fengshuonan
     * @date 2017-07-23 21:26
     */

   /* class DataScopeInterceptor {
        @Throws(Throwable::class)
        override fun intercept(invocation: Invocation): Any {
            val statementHandler = PluginUtils.realTarget<Any>(invocation.target) as StatementHandler
            val metaStatementHandler = SystemMetaObject.forObject(statementHandler)
            val mappedStatement = metaStatementHandler.getValue("delegate.mappedStatement") as MappedStatement

            if (SqlCommandType.SELECT != mappedStatement.sqlCommandType) {
                return invocation.proceed()
            }

            val boundSql = metaStatementHandler.getValue("delegate.boundSql") as BoundSql
            var originalSql = boundSql.sql
            val parameterObject = boundSql.parameterObject

            //查找参数中包含DataScope类型的参数
            val dataScope = findDataScopeObject(parameterObject)

            if (dataScope == null) {
                return invocation.proceed()
            } else {
                val scopeName = dataScope!!.getScopeName()
                val deptIds = dataScope!!.getDeptIds()
                val join = CollectionUtil.join<Long>(deptIds, ",")
                originalSql = "select * from ($originalSql) temp_data_scope where temp_data_scope.$scopeName in ($join)"
                metaStatementHandler.setValue("delegate.boundSql.sql", originalSql)
                return invocation.proceed()
            }
        }

        *//**
         * 查找参数是否包括DataScope对象
         *//*
        fun findDataScopeObject(parameterObj: Any): DataScope? {
            if (parameterObj is DataScope) {
                return parameterObj as DataScope
            } else if (parameterObj is Map<*, *>) {
                for (`val` in parameterObj.values) {
                    if (`val` is DataScope) {
                        return `val` as DataScope
                    }
                }
            }
            return null
        }

        override fun plugin(target: Any): Any {
            return Plugin.wrap(target, this)
        }

        override fun setProperties(properties: Properties) {

        }
    }*/

}