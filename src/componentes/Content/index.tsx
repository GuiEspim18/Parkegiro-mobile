import React from 'react';
import { View } from 'react-native';
import { styles } from './styles';
import NavMenu from '../NavMenu';
import { NavigationContainer } from '@react-navigation/native';
import { createNativeStackNavigator } from '@react-navigation/native-stack';
import Home from '../../pages/Home';
import ParkingLot from '../../pages/ParkingLot';
import { ScreenProps } from 'react-native-screens';

export type RootStackParamList = {
    Home: undefined;
    ParkingLot: { userId: number; name: string };
};

const Tab = createNativeStackNavigator<RootStackParamList>();



function Content(): React.JSX.Element {
    return (
        <NavigationContainer
        >
            <View style={styles.content}>
                <Tab.Navigator initialRouteName="Home">
                    <Tab.Screen 
                        name="Home" 
                        component={Home} 
                        options={{ headerShown: false }}
                    />
                    <Tab.Screen
                        name="ParkingLot"
                        component={ParkingLot}
                        options={{ headerShown: false }}
                    />
                </Tab.Navigator>
                <NavMenu /> 
            </View>
        </NavigationContainer>
    )
}

export default Content;