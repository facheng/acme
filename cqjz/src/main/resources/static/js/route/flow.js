// 已提交一览
mainApp.controller("flowSubmitListCtl", function ($scope, mineGrid, mineHttp, mineUtil) {
    mineHttp.constant("newsType", function (data) {
        $scope.newsTypes = data.content;
    });
    mineGrid.gridPageInit("gridOptions", $scope, {
        data: 'myData',
        multiSelect: false,
        selectWithCheckboxOnly: true,
        requestMethod: "POST",
        requestUrl: fullPath("admin/flow/list/submit"),
        columnDefs: [
            {field: 'processId', width: 80, displayName: '流程号'},
            {field: 'status', width: 70, displayName: '状态'},
            {field: 'businessSource', width: 70, displayName: '来源'},
            {field: 'businessType', width: 100, displayName: '类型'},
            {
                field: 'subject',
                displayName: '主题',
                cellTemplate: "<mine-action action='businessPreview(row.entity)' name='{{row.entity.subject}}'></mine-action>"
            },
            {field: 'nextTaskName', width: 150, displayName: '当前流程'},
            {field: 'taskName', width: 150, displayName: '已完成流程'},
            {field: 'processTime', width: 150, displayName: '申请时间'},
            {field: 'processTimeEnd', width: 150, displayName: '完成时间'},
            {
                field: 'id',
                displayName: '操作',
                width: 100,
                sortable: false,
                cellTemplate: "<mine-action icon='fa fa-sticky-note-o' action='preview(row.entity)' name='查看'></mine-action>"
            }
        ]
    });
    $scope.gridPageQueryCallback = function (data) {
        return {data: data.content.rows, total: data.content.total};
    };
    $scope.query = function () {
        $scope.gridPageQuery({}, $scope.filter);
    };
    $scope.businessPreview = function (flow) {
        mineUtil.modal("admin/_news/newsPreview.htm", "newsPreviewCtl", flow.businessNumber, "lg");
    };
    $scope.preview = function (flow) {
        mineUtil.modal("admin/_flow/flowPreview.htm", "flowPreviewCtl", flow, "lg");
    };
    $scope.query();
});
// 未通过一览
mainApp.controller("flowRejectListCtl", function ($scope, $state, mineGrid, mineHttp, mineUtil) {
    mineGrid.gridPageInit("gridOptions", $scope, {
        data: 'myData',
        multiSelect: false,
        selectWithCheckboxOnly: true,
        requestMethod: "POST",
        requestUrl: fullPath("admin/flow/list/reject"),
        columnDefs: [
            {field: 'processId', width: 80, displayName: '流程号'},
            {field: 'businessSource', width: 70, displayName: '来源'},
            {field: 'businessType', width: 100, displayName: '类型'},
            {
                field: 'subject',
                displayName: '主题',
                cellTemplate: "<mine-action action='businessPreview(row.entity)' name='{{row.entity.subject}}'></mine-action>"
            },
            {field: 'rejectTime', width: 150, displayName: '退回时间'},
            {
                field: 'id',
                displayName: '操作',
                width: 200,
                sortable: false,
                cellTemplate: "<div><mine-action icon='fa fa-sticky-note-o' action='preview(row.entity)' name='查看'></mine-action>" +
                "<mine-action icon='fa fa-sticky-note-o' action='edit(row.entity)' name='修改'></mine-action>" +
                "<mine-action icon='fa fa-sticky-note-o' action='cancel(row.entity)' name='撤消'></mine-action></div>"
            }
        ]
    });
    $scope.gridPageQueryCallback = function (data) {
        return {data: data.content.rows, total: data.content.total};
    };
    $scope.query = function () {
        $scope.gridPageQuery({}, $scope.filter);
    };
    $scope.businessPreview = function (flow) {
        mineUtil.modal("admin/_news/newsPreview.htm", "newsPreviewCtl", flow.businessNumber, "lg");
    };
    $scope.preview = function (flow) {
        mineUtil.modal("admin/_flow/flowPreview.htm", "flowPreviewCtl", flow, "lg");
    };
    $scope.edit = function (flow) {
        $state.go("news.edit", {number: flow.businessNumber});
    };
    $scope.cancel = function (flow) {
        alert(flow.businessNumber);
    };
    $scope.query();
});
// 待处理一览
mainApp.controller("flowPendingListCtl", function ($scope, $state, mineHttp, mineGrid, mineUtil) {
    mineHttp.constant("newsType", function (data) {
        $scope.newsTypes = data.content;
    });
    mineGrid.gridPageInit("gridOptions", $scope, {
        data: 'myData',
        multiSelect: false,
        selectWithCheckboxOnly: true,
        requestMethod: "POST",
        requestUrl: fullPath("admin/flow/list/pending"),
        columnDefs: [
            {field: 'processId', width: 80, displayName: '流程号'},
            {field: 'businessSource', width: 70, displayName: '来源'},
            {field: 'businessType', width: 100, displayName: '类型'},
            {
                field: 'subject',
                displayName: '主题',
                cellTemplate: "<mine-action action='preview(row.entity)' name='{{row.entity.subject}}'></mine-action>"
            },
            {field: 'applyUser', width: 150, displayName: '申请人'},
            {field: 'applyTime', width: 150, displayName: '申请时间'},
            {field: 'receiveTime', width: 150, displayName: '接收时间'},
            {
                field: 'id',
                displayName: '操作',
                width: 150,
                sortable: false,
                cellTemplate: "<mine-action icon='fa fa-sticky-note-o' action='approve(row.entity)' name='审核'></mine-action>"
            }
        ]
    });
    $scope.gridPageQueryCallback = function (data) {
        return {data: data.content.rows, total: data.content.total};
    };
    $scope.query = function () {
        $scope.gridPageQuery({}, $scope.filter);
    };
    $scope.approve = function (flow) {
        $state.go("flow.approve", {taskId: flow.taskId, processId: flow.processId});
    };
    $scope.preview = function (flow) {
        mineUtil.modal("admin/_news/newsPreview.htm", "newsPreviewCtl", flow.businessNumber, "lg");
    };
    $scope.query();
});
// 已审批一览
mainApp.controller("flowApproveListCtl", function ($scope, $state, mineGrid, mineUtil) {
    mineGrid.gridPageInit("gridOptions", $scope, {
        data: 'myData',
        multiSelect: false,
        selectWithCheckboxOnly: true,
        requestMethod: "POST",
        requestUrl: fullPath("admin/flow/list/approve"),
        columnDefs: [
            {field: 'processId', width: 80, displayName: '流程号'},
            {field: 'taskId', width: 80, displayName: '任务号'},
            {field: 'businessSource', width: 70, displayName: '来源'},
            {field: 'businessType', width: 100, displayName: '类型'},
            {
                field: 'subject',
                displayName: '主题',
                cellTemplate: "<mine-action action='businessPreview(row.entity)' name='{{row.entity.subject}}'></mine-action>"
            },
            {field: 'taskName', width: 150, displayName: '处理流程'},
            {
                field: 'process',
                width: 150,
                displayName: '处理结果',
                cellTemplate: "<span class='mine-table-span'>{{row.entity.processMessage}}</span>"
            },
            {field: 'processTime', width: 150, displayName: '处理时间'},
            {
                field: 'id',
                displayName: '操作',
                width: 150,
                sortable: false,
                cellTemplate: "<mine-action icon='fa fa-sticky-note-o' action='preview(row.entity)' name='详情'></mine-action>"
            }
        ]
    });
    $scope.gridPageQueryCallback = function (data) {
        return {data: data.content.rows, total: data.content.total};
    };
    $scope.query = function () {
        $scope.gridPageQuery({}, $scope.filter);
    };
    $scope.businessPreview = function (flow) {
        mineUtil.modal("admin/_news/newsPreview.htm", "newsPreviewCtl", flow.businessNumber, "lg");
    };
    $scope.preview = function (flow) {
        mineUtil.modal("admin/_flow/flowPreview.htm", "flowPreviewCtl", flow, "lg");
    };
    $scope.query();
});
// 审批页
mainApp.controller("flowApproveCtl", function ($scope, $stateParams, mineHttp, mineUtil) {
    var taskId = $stateParams.taskId;
    var processId = $stateParams.processId;
    $scope.approve = {};
    $scope.approve.taskId = taskId;
    $scope.approve.process = "2";
    $scope.preview = function (flow) {
        mineUtil.modal("admin/_news/newsPreview.htm", "newsPreviewCtl", flow.businessNumber, "lg");
    };
    mineHttp.send("GET", "admin/flow/" + processId + "/approve", null, function (result) {
        $scope.flow = result.content;
    });
    $scope.approveSubmit = function () {
        mineHttp.send("POST", "admin/flow/approve", {data: $scope.approve}, function (result) {
            $scope.flow = result.content;
        });
    }
});
// 审批预览页
mainApp.controller("flowPreviewCtl", function ($scope, $uibModalInstance, mineHttp, data) {
    mineHttp.send("GET", "admin/flow/" + data.processId, null, function (result) {
        $scope.flow = result.content;
        $scope.approveHistories = result.content.approveHistories;
    });
    $scope.cancel = function () {
        $uibModalInstance.dismiss('cancel');
    };
});