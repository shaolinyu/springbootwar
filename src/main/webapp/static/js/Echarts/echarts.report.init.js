/**
 */
// 图形报表展示 代办总数
$(function () {
    var dom = document.getElementById("sum");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        backgroundColor: '#fff',
        grid: {
            left: '2%',
            right: '2%',
            bottom: '5%',
            containLabel: true
        },
        xAxis: {
            data: ['徐州', '淮南', '铜陵', '六安', '安庆', '阜阳', '宜城', '淮北', '亳州', '黄山', '马鞍山', '芜湖', '宿州', '池州', '蚌埠', '合肥'],
            axisLine: {
                lineStyle: {
                    color: '#5b5b5b'
                }
            },
            axisLabel: {
                color: '#5b5b5b',
                fontSize: 14
            }
        },
        yAxis: {
            name: "单位:个",
            nameTextStyle: {
                color: '#5b5b5b',
                fontSize: 16
            },
            axisLine: {
                lineStyle: {
                    color: '#3d5269'
                }
            },
            axisLabel: {
                color: '#5b5b5b',
                fontSize: 16
            },
            splitLine: {
                show:true,
                lineStyle: {
                     type:'dashed',
                    color: '#2d3d53'
                }
            },
            "min":0,
            "max":250
    
        },
        series: [{
            type: 'bar',
            barWidth: 20,
            itemStyle:{
                normal:{
                    color:new echarts.graphic.LinearGradient(0, 0, 0, 1, [{
                        offset: 0,
                        color: '#09d7d8'
                    }, {
                        offset: 1,
                        color: '#6c8ffa'
                    }], false)
                }
            },
            label: {
                normal: {
                    show: true,
                    fontSize: 18,
                    fontWeight: 'bold',
                    color: '#3d8bf0',
                    position: 'top',
                }
            },
            data: [120, 200, 150, 80, 70, 110, 130, 120, 200, 150, 80, 70, 110, 130, 110, 90]
        }]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
});

