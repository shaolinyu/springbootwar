/**
 */
// 问题完成情况内容
$(function () {
    var dom = document.getElementById("chart1");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        backgroundColor:'#fff',
            color: '#6fb0ff',
            tooltip: {
              trigger: "axis",
              axisPointer: {
                type: "shadow",
                label: {
                  show: false
                }
              }
            },
            xAxis: {
              data: ["徐州", "宜城", "安庆", "淮南", "芙湖", "铜陵", "池州", "池州", "合肥", "宿州", "六安", "马鞍山", "黄山", "蚌埠", "淮北", "阜阳"],
              axisLine: {
                show: true //隐藏X轴轴线
              },
              axisTick: {
                show: true //隐藏X轴刻度
              },
              axisLabel: {
                show: true,
                textStyle: {
                  color: "#333" //X轴文字颜色
                }
              },
              axisLine: {
                lineStyle: {
                  color: "#999"
                }
              }
            },
            yAxis: [
              {
                nameTextStyle: {
                  color: "#ebf8ac"
                },
                splitLine: {
                  show: false
                },
                splitLine: {
                  show: false
                },
                axisTick: {
                  show: true
                },
                axisLine: {
                  show: true
                },
                axisLabel: {
                  show: true,
                  textStyle: {
                    color: "#333"
                  }
                },
                axisLine: {
                  lineStyle: {
                    color: "#999"
                  }
                }
              },
              {
                nameTextStyle: {
                  color: "#ebf8ac"
                },
                position: "right",
                splitLine: {
                  show: false
                },
                splitLine: {
                  show: false
                },
                axisTick: {
                  show: false
                },
                axisLine: {
                  show: false
                },
                axisLabel: {
                  show: false,
                  formatter: "{value} %", //右侧Y轴文字显示
                  textStyle: {
                    color: "#ebf8ac"
                  }
                }
              }
            ],
            series: [
              {
                name: "设备型号",
                type: "bar",
                barWidth: 15,
                itemStyle: {
                    normal: {
                        color: function(params) {
                            var colorList = [
                                "#37b70c", "#fae521", "#f29c00", "#dd3f36", "#b3013f", "#a00398", '#E87C25', '#C6E579',"#5dcbfe", "#72b2f9", "#7c74ff", "#fae521", "#f29c00", "#dd3f36", '#cb77ff', '#ff71da','#ffd271'
                            ];
                            return colorList[params.dataIndex]
                        },
                        barBorderRadius: [30, 30, 0, 0],
                    }
                },
                data: [40, 38, 48, 35, 29, 28, 30,40, 38, 48, 35, 29, 28, 30,28,]
              }
            ]
          };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
});
// 举措完成情况内容
$(function () {
    var dom = document.getElementById("chart2");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        backgroundColor: '#fff',
        color: ['#75afff', ' #5bc9ff'],
        barWidth: 14,
        title: {
            // text: '世界人口总量',
            // subtext: '数据来自网络'
        },
        tooltip: {
            trigger: 'axis',
            axisPointer: {
                type: 'shadow'
            }
        },
        legend: {
            // left: '0%',
            bottom: '10',
            x:'center', //可设定图例在左、右、居中
            // icon: 'circle',
            textStyle: { //图例文字的样式
                color: '#8C8C8C',
                fontSize: 12
            },
            data: ['一周以上', '一月以上']
        },
        grid: {
            left: '3%',
            right: '4%',
            bottom: '10%',
            containLabel: true
        },
        xAxis: {
            type: 'category',
            splitLine: {
                show: false // 去除网格线
            },
            axisLine: {
                lineStyle: {
                    type: 'solid',
                    color: '#BFBFBF', // 坐标线的颜色
                    width: '1'
                }
            },
            axisLabel: {
                textStyle: {
                    color: '#595959' //坐标值的颜色
                },
                formatter: function (params) {
                    var newParamsName = ''
                    var paramsNameNumber = params.length //总字数
                    var provideNumber = 5 //一行显示几个字
                    var rowNumber = Math.ceil(paramsNameNumber / provideNumber)
                    if (paramsNameNumber > provideNumber) {
                        for (var p = 0; p < rowNumber; p++) {
                            var tempStr = ''
                            var start = p * provideNumber
                            var end = start + provideNumber
                            if (p == rowNumber - 1) {
                                tempStr = params.substring(start, paramsNameNumber)
                            } else {
                                tempStr = params.substring(start, end) + '\n'
                            }
                            newParamsName += tempStr
                        }
                    } else {
                        newParamsName = params
                    }
                    return newParamsName
                }
            },
            boundaryGap: [0, 0.01],
            data: ['7月', '6月']
        },
        yAxis: {
            type: 'value',
            splitLine: {
                // show: false // 去除网格线
                lineStyle:{
                    color: '#E8E8E8',
                    type: 'dashed' //设置间隔线为虚线
                }
            },
            axisTick: {
                show: false //小横线
            },
            splitArea: {
                // show: true // 保留网格区域
            },
            axisLine: {
                show: false, // 去除纵向边框线
                lineStyle: {
                    type: 'solid',
                    color: '#BFBFBF', // 坐标线的颜色
                    width: '1'
                }
            },
            axisLabel: {
                textStyle: {
                    color: '#595959' //坐标值的颜色
                }
            }
        },
        series: [
            {
                name: '一周以上',
                type: 'bar',
                label: {
                    show: false,
                    position: 'right', // 位置
                    color: '#298DFF',
                    fontSize: 12,
                    fontWeight: 'normal', // 加粗
                    distance: 5, // 距离
                    offset: [0, 1] // 偏移距离[横向，纵向]
                }, // 柱子上方的数值
                data: [30, 40, 30, 22, 60]
            },
            {
                name: '一月以上',
                type: 'bar',
                label: {
                    show: false,
                    position: 'right', // 位置
                    color: '#33CA66',
                    fontSize: 12,
                    fontWeight: 'normal', // 加粗
                    distance: 5, // 距离
                    offset: [0, 2] // 偏移距离[横向，纵向]
                }, // 柱子右方的数值
                data: [20, 20, 20, 20, 10]
            }
        ]
    }
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
});
// 合肥分公司文件处理效率统计分析
$(function () {
    var dom = document.getElementById("line");
    var myChart = echarts.init(dom);
    var app = {};
    option = null;
    option = {
        backgroundColor: "#fff",
        tooltip: {
            trigger: 'axis',
            show: true,
        },
        legend: {
            show: true,
            // icon: 'circle',
            top: 20,
            textStyle: {
                color: '#4c647c',
                fontStyle: 'normal',
                fontFamily: '微软雅黑',
                fontSize: 12,            
            },
        },
        grid: {
            left: '5%',
            right: '5%',
            top: '15%',
            bottom: '6%',
            containLabel: true
        },
        xAxis: {
            axisLine: {
                show: true
            },
            axisTick: {
                show: false
            },
            axisLabel: {
                interval: 0,
            },
            data: ['审核', '会签', '签发', '批办']
        },
        yAxis: {
            axisLine: {
                show: true,
            },
            axisTick: {
                show: false
            },
            splitLine :{    //网格线
                lineStyle:{
                    type:'dashed'    //设置网格线类型 dotted：虚线   solid:实线
                },
                show:true, //隐藏或显示
                
            },
        "min":0,
        "max":3
                
        },
        series: [{
            name:'A',
                type: 'line',
                smooth: true,
                symbol: 'circle',
                symbolSize: 13,
                lineStyle: {
                    normal: {
                        width: 3,
                        shadowColor: 'rgba(155, 18, 184, .4)',
                        shadowBlur: 5,
                        shadowOffsetY: 20,
                        shadowOffsetX: 0,
                        color: '#fb7636',
                    }
                },
                itemStyle: {
                    color: '#fb7636',
                    borderColor: "#fff",
                    borderWidth: 2,
                },
    
                data: [2.83, 2.85, 2.84, 2.83]
            },
            {
                name:'B',
                type: 'line',
                smooth: true,
                symbol: 'circle',
                symbolSize: 13,
                lineStyle: {
                    normal: {
                        width: 3,
                        shadowColor: 'rgba(155, 18, 184, .4)',
                        shadowBlur: 5,
                        shadowOffsetY: 20,
                        shadowOffsetX: 0,
                        color: '#1e90ff',
                    }
                },
                itemStyle: {
                    color: '#1e90ff',
                    borderColor: "#fff",
                    borderWidth: 2,
                },
    
                data: [0.62, 0.7, 0.6, 0.61]
            }
        ]
    };
    if (option && typeof option === "object") {
        myChart.setOption(option, true);
    }
});


