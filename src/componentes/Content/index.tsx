import React from 'react';
import { View } from 'react-native';
import { styles } from './styles';
import NavMenu from '../NavMenu';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import Home from '../../pages/Home';
import ParkingLot from '../../pages/ParkingLot';

export type RootStackParamList = {
    Home: undefined;
    ParkingLot: { userId: number; name: string };
};

const Stack = createNativeStackNavigator<RootStackParamList>();


function Content(): React.JSX.Element {
    return (
        <View style={styles.content}>
            <NavigationContainer>
                <Stack.Navigator initialRouteName="Home">
                    <Stack.Screen name="Home" component={Home} />
                    <Stack.Screen name="ParkingLot" component={ParkingLot} /> {/* Corrigido aqui */}
                </Stack.Navigator>
            </NavigationContainer>
            <NavMenu />
        </View>
    )
}

export default Content;