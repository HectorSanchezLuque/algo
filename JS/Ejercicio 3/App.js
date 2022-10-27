import { StatusBar } from 'expo-status-bar';
import { StyleSheet, Text, View } from 'react-native';
import { Square, Triangle, Circle, QuarterCircle, Rectangle } from './Components/Figures'


export default function App() {

    /* Ejercicio 1
    const content = [{
        size: "200",
        mt: "0",
        marginTop: 200,
        width: 100,
        height: 100,
        backgroundColor: "blue"
    },
        {size: "200",
        mt: "0",
        marginTop: 0,
        width: 200,
        height: 200,
        backgroundColor: "red"}]

    const contents = content.map((value, index) =>
        <Square
            size={value.size}
            mt={value.mt}
            marginTop={value.marginTop}
            width={value.width}
            height={value.height}
            backgroundColor={value.backgroundColor}
        />*/

    /* Ejercicio 2
const content = [{
    size: "200",
    mt: "0",
    marginTop: 200,
    width: 200,
    height: 100,
    backgroundColor: "blue"
},
{
    size: "200",
    mt: "0",
    marginTop: 0,
    width: 100,
    height: 100,
    backgroundColor: "red",
    size2: "200",
    mt2: "0",
    marginTop2: 0,
    width2: 100,
    height2: 100,
    backgroundColor2: "blue"
},

{
    size: "200",
    mt: "0",
    marginTop: 0,
    width: 200,
    height: 100,
    backgroundColor: "red"
}]*/

    /*Ejercicio 3
const content = [{
            size:"200",
            mt:"-2",
            marginTop: 200,
            width: 0,
            height: 0,
            backgroundColor: "transparent",
            borderLeftWidth: 50,
            borderRightWidth: 50,
            borderBottomWidth: 100,
            borderLeftColor: "transparent",
            borderRightColor: "transparent",
            borderBottomColor:"blue"
},
{
    size: "100",
    mt: "0",
    marginTop: 0,
    width: 100,
    height: 100,
    backgroundColor: "blue"
},

{
    size: "200",
    mt: "0",
    marginTop: 0,
    width: 200,
    height: 100,
    backgroundColor: "blue"
    
}]*/

    /* Ejercicio 4
    const content = [{
        size: "100", mt: "-2", marginTop: 200,
                width: 100,
                height: 100,
                borderRadius: 100 / 2,
                backgroundColor: "blue",
    }]*/

    const content = [{
        size: "100", mt: "-2", marginTop: 0,
        width: 100,
        height: 100,
        borderTopLeftRadius: 150,
        borderTopRightRadius: 0,
        borderBottomLeftRadius: 0,
        borderBottomRightRadius: 0,
        backgroundColor: "blue",
    }]





    const contents = content.map((value, index) =>
        <View style={{ flexDirection: "column" }}>
            <View style={{ flexDirection: "row" }}>
                <QuarterCircle
                    size={value.size} mt={value.mt} marginTop={value.marginTop}
                    width={value.width}
                    height={value.height}
                    borderTopLeftRadius={value.borderTopLeftRadius}
                    borderTopRightRadius={value.borderTopRightRadius}
                    borderBottomLeftRadius={value.borderBottomLeftRadius}
                    borderBottomRightRadius={value.borderBottomRightRadius}
                    backgroundColor={value.backgroundColor}
                />
                <View style={{ transform: 'rotate(90deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={value.width}
                        height={value.height}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"red"}
                    />
                </View>

            </View>
            <View style={{ flexDirection: "row" }}>
                <View style={{ transform: 'rotate(270deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={value.width}
                        height={value.height}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"red"}
                    />
                </View>
                <View style={{ transform: 'rotate(180deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={value.width}
                        height={value.height}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"blue"}
                    />
                </View>

            </View>
            <View style={{ flexDirection: "row" }}>
                <QuarterCircle
                    size={value.size} mt={value.mt} marginTop={value.marginTop}
                    width={75}
                    height={75}
                    borderTopLeftRadius={value.borderTopLeftRadius}
                    borderTopRightRadius={value.borderTopRightRadius}
                    borderBottomLeftRadius={value.borderBottomLeftRadius}
                    borderBottomRightRadius={value.borderBottomRightRadius}
                    backgroundColor={value.backgroundColor}
                />
                <View style={{ transform: 'rotate(90deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={75}
                        height={75}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"red"}
                    />
                </View>

            </View>
            <View style={{ flexDirection: "row" }}>
                <View style={{ transform: 'rotate(270deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={75}
                        height={75}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"red"}
                    />
                </View>
                <View style={{ transform: 'rotate(180deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={75}
                        height={75}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"blue"}
                    />
                </View>
            </View>
            <View style={{ flexDirection: "row" }}>
                <QuarterCircle
                    size={value.size} mt={value.mt} marginTop={value.marginTop}
                    width={50}
                    height={50}
                    borderTopLeftRadius={value.borderTopLeftRadius}
                    borderTopRightRadius={value.borderTopRightRadius}
                    borderBottomLeftRadius={value.borderBottomLeftRadius}
                    borderBottomRightRadius={value.borderBottomRightRadius}
                    backgroundColor={value.backgroundColor}
                />
                <View style={{ transform: 'rotate(90deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={50}
                        height={50}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"red"}
                    />
                </View>

            </View>
            <View style={{ flexDirection: "row" }}>
                <View style={{ transform: 'rotate(270deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={50}
                        height={50}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"red"}
                    />
                </View>
                <View style={{ transform: 'rotate(180deg)' }}>
                    <QuarterCircle
                        size={value.size} mt={value.mt} marginTop={value.marginTop}
                        width={50}
                        height={50}
                        borderTopLeftRadius={value.borderTopLeftRadius}
                        borderTopRightRadius={value.borderTopRightRadius}
                        borderBottomLeftRadius={value.borderBottomLeftRadius}
                        borderBottomRightRadius={value.borderBottomRightRadius}
                        backgroundColor={"blue"}
                    />
                </View>
            </View>
        </View>
    )
    return (
        <View style={{ alignItems: "center" }}>
            {contents}
        </View>

    );
}

const styles = StyleSheet.create({
    container: {
        flex: 1,
        backgroundColor: '#fff',
        alignItems: 'center',
        justifyContent: 'center',
    },
});

